package com.example.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.example.interfaces.InfoRetriever;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class MostRecentEnvironmentIntentHandler implements RequestHandler, InfoRetriever {
    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("EnvironmentIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        return handlerInput.getResponseBuilder()
                .withSpeech(environmentResponse)
                .build();
    }

    @Override
    public String getProPublica() throws IOException {
        URL url = new URL("https://api.propublica.org/congress/v1/bills/search.json?query=environment");
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

    // ***Test the following to adjust the file into proper json format***
        String environmentResults = stringBuilder.substring(107, 51574);

        return environmentResults;
    }

    @Override
    public JSONObject createObject(String text) throws IOException, JSONException {
        return new JSONObject(text);
    }

    @Override
    public String mostRecent() throws IOException, JSONException {
        String getInfo = getProPublica();
        JSONObject bills = createObject(getInfo);
        String shortTitle = (String) bills.getJSONArray("bills").getJSONObject(0).get("short_title");
        String shortSummary = (String) bills.getJSONArray("bills").getJSONObject(0).get("summary_short");
        String latestMajorActionDate = (String) bills.getJSONArray("bills").getJSONObject(0)
                .get("latest_major_action_date");
        String latestMajorAction = (String) bills.getJSONArray("bills").getJSONObject(0)
                .get("latest_major_action");
        return shortTitle + ", " + shortSummary + ", " + latestMajorActionDate + ", " + latestMajorAction;
    }

    String environmentResponse;

    {
        try {
            environmentResponse = mostRecent();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
