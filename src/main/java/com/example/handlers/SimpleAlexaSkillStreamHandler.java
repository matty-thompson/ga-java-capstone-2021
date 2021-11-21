package com.example.handlers;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

import java.io.IOException;

public class SimpleAlexaSkillStreamHandler extends SkillStreamHandler {


    public SimpleAlexaSkillStreamHandler() {
        super(Skills.standard()
                .addRequestHandler(new WelcomeRequestHandler())
                .addRequestHandler(new CustomLaunchRequestHandler())
                .addRequestHandler(new FarewellRequestHandler())
                .addRequestHandler(new ProPublicaHandler())
                .build());
    }

}
