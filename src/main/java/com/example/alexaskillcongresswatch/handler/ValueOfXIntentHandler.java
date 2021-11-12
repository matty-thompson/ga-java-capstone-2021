package com.example.alexaskillcongresswatch.handler;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class ValueOfXIntentHandler implements RequestHandler {


    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(Predicates.intentName("ValueOfXIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        String speechText = "The value of x is Willie Nelson";
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("CongressWatch", speechText)
                .build();
    }
}
