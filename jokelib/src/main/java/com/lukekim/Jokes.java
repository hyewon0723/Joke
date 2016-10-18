package com.lukekim;

import java.util.Random;

public class Jokes {
    public static String retrieveRandomJoke() {
        String [] jokes = {"Some people just have a way with words, and other people … oh … not have way.",
                "The four most beautiful words in our common language:  I told you so.",
        "All pro athletes are bilingual. They speak English and profanity.",
        "If you understand English, press 1. If you do not understand English, press 2."};

        int index = new Random().nextInt(jokes.length);
        return jokes[index];

    }
}
