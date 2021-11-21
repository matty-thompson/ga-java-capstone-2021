package com.example.handlers;

/* This handler brings the most recent bill sent to the President from Congress.
   It uses a private API Key from ProPublica.org to retrieve the information.
 */

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import org.json.JSONException;
import org.json.JSONObject;

import static com.amazon.ask.request.Predicates.intentName;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

public class MostRecentBillIntentHandler implements RequestHandler {

    /* The following two methods are standard for different Alexa Intents.
    The "canHandle" method determines the specific intent Alexa will look for.
    The "handle" method is where you provide Alexa with what you want it to say.
     */

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("MostRecentBillIntent"));
    }


    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        return handlerInput.getResponseBuilder()
                .withSpeech("TEST")
                .build();
    }

    /* The following methods retrieve the most recent bill from ProPublica.
        "getProPublica": This is where we connect to ProPublica with our private API Key.
             This method is repeated because every json file from each endpoint has to be manually cut down.
             ***PLEASE NOTE*** The substring may need to be altered for the following methods to work.
        "createObject": This converts the string of data to a JSON Object
        "mostRecent": This isolates a specific bill and returns its information.
    */

    public static String getProPublica() throws IOException {

        URL url = new URL("https://api.propublica.org/congress/v1/bills/search.json?query=megahertz");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestProperty("X-API-Key", "O1ZdWmc8x27g8x05YHkc0VYKHfCBYTTTuvDAt4Kn");
        conn.setRequestProperty("Content-Type", "application/json");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String output;

        StringBuilder stringBuilder = new StringBuilder();
        while ((output = in.readLine()) != null) {
            stringBuilder.append(output);
        }
        in.close();

        String billResults = stringBuilder.substring(112, 57840);

        return billResults;
    }

    public static JSONObject createObject(String text) throws IOException, JSONException {
        return new JSONObject(text);
    }

    public static String mostRecent() throws IOException, JSONException {

        String getInfo = getProPublica();
        JSONObject bills = createObject(getInfo);
        String title = (String) bills.getJSONArray("bills").getJSONObject(0).get("short_title");
        String shortSummary = (String) bills.getJSONArray("bills").getJSONObject(0).get("summary_short");
        return title + " " + shortSummary;
    }

}
