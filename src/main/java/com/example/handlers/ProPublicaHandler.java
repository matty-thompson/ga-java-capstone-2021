package com.example.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class ProPublicaHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("ProPublicaIntent"));
    }


    public static String retrieveProPublica(String enpoint) throws IOException {

        URL url = new URL("https://api.propublica.org/congress/v1/bills/search.json?query=megahertz" + enpoint);
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

//            String senateResults = stringBuilder.substring(245, 209466);
        String billResults = stringBuilder.substring(112, 57840);


        return billResults;
    }

    public static JSONObject createObject(String text) throws IOException, JSONException {
        return new JSONObject(text);
    }

    public static String mostRecent() throws IOException, JSONException {

        String getInfo = retrieveProPublica();
        JSONObject bills = createObject(getInfo);
        String title = (String) bills.getJSONArray("bills").getJSONObject(0).get("short_title");
        String shortSummary = (String) bills.getJSONArray("bills").getJSONObject(0).get("summary_short");
        return title + " " + shortSummary;
    }

    String response;

    {
        try {
            response = mostRecent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        return handlerInput.getResponseBuilder()
                .withSpeech(response)
                .build();
    }

}
