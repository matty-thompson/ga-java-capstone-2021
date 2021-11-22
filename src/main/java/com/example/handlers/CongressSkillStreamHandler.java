package com.example.handlers;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class CongressSkillStreamHandler extends SkillStreamHandler {

    public CongressSkillStreamHandler(){
        super(Skills.standard()
                .addRequestHandler(new MostRecentBillIntentHandler())
                .addRequestHandler(new CongressWatchLaunchRequestHandler())
                .addRequestHandler(new FarewellRequestHandler())
                .addRequestHandler(new MostRecentHealthIntentHandler())
                .addRequestHandler(new MostRecentMilitaryIntentHandler())
                .addRequestHandler(new MostRecentConfirmedNomineeIntentHandler())
                .addRequestHandler(new WithdrawnNomineeIntentHandler())
                .addRequestHandler(new MostRecentEnvironmentIntentHandler())
                .build());
    }

}
