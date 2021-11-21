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

public class MostRecentHealthIntentHandler implements RequestHandler, InfoRetriever {
    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("MostRecentHealthIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        return handlerInput.getResponseBuilder()
                .withSpeech("MOST RECENT HEALTH")
                .build();
    }

    @Override
    public String getProPublica() throws IOException {
        URL url = new URL("https://api.propublica.org/congress/v1/bills/search.json?query=health");
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
        String healthResults = stringBuilder.substring(107, 50183);

        return healthResults;
    }

    @Override
    public JSONObject createObject(String text) throws IOException, JSONException {
        return null;
    }

    @Override
    public String mostRecent() throws IOException, JSONException {
        return null;
    }


    public static void main(String[] args) {
        MostRecentHealthIntentHandler mostRecentHealthIntentHandler = new MostRecentHealthIntentHandler();
        try {
            System.out.println(mostRecentHealthIntentHandler.getProPublica());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
