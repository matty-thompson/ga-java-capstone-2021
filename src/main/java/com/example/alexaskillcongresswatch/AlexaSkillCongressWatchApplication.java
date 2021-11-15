package com.example.alexaskillcongresswatch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlexaSkillCongressWatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlexaSkillCongressWatchApplication.class, args);

        try {
            getApiRequest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getApiRequest() throws IOException {

        // Get 10th record data
        URL getUrl = new URL("https://api.propublica.org/congress/v1/");
        String accessToken = "O1ZdWmc8x27g8x05YHkc0VYKHfCBYTTTuvDAt4Kn";

        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();


        // Set request method
        connection.setRequestMethod("GET");

        connection.setRequestProperty("Authorization", "Bearer "+ accessToken);

        // Getting response code
        int responseCode = connection.getResponseCode();

        // If responseCode is 200 means we get data successfully
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer jsonResponseData = new StringBuffer();
            String readLine = null;

            // Append response line by line
            while ((readLine = in.readLine()) != null) {
                jsonResponseData.append(readLine);
            }

            in.close();
            // Print result in string format
            System.out.println("JSON String Data " + jsonResponseData.toString());
        } else {
            System.out.println(responseCode);
        }

    }

}
