package com.example.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.example.controller.FactController;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CatFactRequestHandler implements RequestHandler {
    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("CatFactIntent"));
    }

    FactController factController = new FactController();

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        return handlerInput.getResponseBuilder()
                .withSpeech("CAT FACT PLACEHOLDER")
                .build();
    }
}