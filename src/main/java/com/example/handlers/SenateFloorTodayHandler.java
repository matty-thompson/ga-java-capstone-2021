//package com.example.handlers;
//
//import com.amazon.ask.dispatcher.request.handler.HandlerInput;
//import com.amazon.ask.dispatcher.request.handler.RequestHandler;
//import com.amazon.ask.model.Response;
//import org.json.JSONObject;
//import org.json.XML;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.Optional;
//
//import static com.amazon.ask.request.Predicates.intentName;
//
//public class SenateFloorTodayHandler implements RequestHandler {
//
//    private static final String SENATETODAY = "https://www.congress.gov/rss/presented-to-president.xml";
//
//    @Override
//    public boolean canHandle(HandlerInput handlerInput) {
//        return handlerInput.matches(intentName("SenateFloorTodayIntent"));
//    }
//
//    // ******* this is to read from the rss feed **********
//
////    String xmlString = readUrlToString("https://www.congress.gov/rss/presented-to-president.xml");
////    JSONObject xmlJSONObj = XML.toJSONObject(xmlString);
////    String jsonPrettyPrintString = xmlJSONObj.toString(4);
////        System.out.println(jsonPrettyPrintString);
//
//
//    public static String readUrlToString(String url) {
//        BufferedReader reader = null;
//        String result = null;
//        try {
//            URL u = new URL(url);
//            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
////            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
//            conn.setRequestMethod("GET");
//            conn.setDoOutput(true);
//            conn.setReadTimeout(2 * 1000);
//            conn.connect();
//            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            StringBuilder builder = new StringBuilder();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                builder.append(line).append("\n");
//            }
//            result = builder.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException ignoreOnClose) {
//                }
//            }
//        }
//        return result;
//    }
//
//    //******* This assigns the RSS value to a String *******
//
//    public String getSenateData() throws IOException {
//
//        String xmlString = null;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        readUrlToString("https://www.congress.gov/rss/presented-to-president.xml");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        String json = xmlString.substring(519, 2586);
//        JSONObject xmlJSONObj = XML.toJSONObject(json);
//        String jsonPrettyPrintString = xmlJSONObj.toString(4);
////     System.out.println(jsonPrettyPrintString);
//        String title = (String) xmlJSONObj.getJSONArray("item").getJSONObject(0).get("title");
//        String description = (String) xmlJSONObj.getJSONArray("item").getJSONObject(0).get("description");
//
//        return title + " " + description;
//    }
//
//        String response;
//
//    {
//        try {
//            response = getSenateData();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//
//    public Optional<Response> handle (HandlerInput handlerInput){
//        return handlerInput.getResponseBuilder()
//                .withSpeech(response)
//                .build();
//    }
//}
