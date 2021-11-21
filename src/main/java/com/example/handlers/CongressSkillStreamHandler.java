package com.example.handlers;

import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class CongressSkillStreamHandler extends SkillStreamHandler {

    public CongressSkillStreamHandler(){
        super(Skills.standard()
                .build());
    }

}
