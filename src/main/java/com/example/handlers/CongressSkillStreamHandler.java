package com.example.handlers;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class CongressSkillStreamHandler extends SkillStreamHandler {

    public CongressSkillStreamHandler(){
        super(Skills.standard()
                .addRequestHandler(new MostRecentBillIntentHandler())
                .addRequestHandler(new CongressWatchLaunchRequestHandler())
                .addRequestHandler(new FarewellRequestHandler())
                .build());
    }

}
