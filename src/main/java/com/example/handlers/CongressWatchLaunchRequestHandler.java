package com.example.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.impl.LaunchRequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import org.slf4j.Logger;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.requestType;
import static org.slf4j.LoggerFactory.getLogger;

public class CongressWatchLaunchRequestHandler implements LaunchRequestHandler {
    private static Logger logger = getLogger(CongressWatchLaunchRequestHandler.class);

    @Override
    public boolean canHandle(HandlerInput input, LaunchRequest launchRequest) {
        return input.matches(requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input, LaunchRequest launchRequest) {
        logger.info("Received unrecognized request: " + input.getRequestEnvelopeJson());
        return input.getResponseBuilder()
                .withSpeech("Welcome to Congress Watch")
                .build();
    }
}
