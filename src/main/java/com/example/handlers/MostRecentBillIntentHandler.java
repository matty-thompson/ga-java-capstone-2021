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
        return Optional.empty();
    }

    

}
