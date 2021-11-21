package com.example.handlers;

/* This handler brings the most recent bill sent to the President from Congress.
   It uses a private API Key from ProPublica.org to retrieve the information.
 */

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.intentName;
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
        "retrieveProPublica": This is where we connect to ProPublica with our private API Key.
             This method is repeated because every json file from each endpoint has to be manually cut down.
             ***PLEASE NOTE*** The substring may need to be altered for the following methods to work.
        "createObject": This converts the string of data to a JSON Object
        "mostRecent": This isolates a specific bill and returns its information.
    */

    


}
