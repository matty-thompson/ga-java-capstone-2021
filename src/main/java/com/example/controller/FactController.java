package com.example.controller;
import com.example.service.OpenAPIService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import com.example.CatFact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


@Controller
public class FactController {

    private static final String template = "Your fact of the day is %s!";
//    private static final String redirectUrl = "https://cat-fact.herokuapp.com";
//    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'.0Z'");
    private final Logger logger = LoggerFactory.getLogger(FactController.class);


    @ResponseBody
    public String sayCatFact(@RequestParam(name="text", required=false, defaultValue = "Cats are fun!") String text) throws IOException {
        logger.info("Meow");
        OpenAPIService openAPIService = new OpenAPIService();

        return String.format(template, openAPIService.getApiRequest());
    }


}
