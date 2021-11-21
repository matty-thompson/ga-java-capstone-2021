package com.example;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    private String title;
    private String description;
    private String link;

    private static List<FeedMessage> entries = new ArrayList<FeedMessage>();

    public Feed(String title, String description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;

    }

    public static List<FeedMessage> getMessages() {
        return entries;
    }


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return  title + " " + description;
    }


}
