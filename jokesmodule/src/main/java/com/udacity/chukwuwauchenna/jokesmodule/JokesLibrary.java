package com.udacity.chukwuwauchenna.jokesmodule;

import java.util.Random;

public class JokesLibrary {
    private static String[] jokes = {
            "Why do java Programmers have to wear glasses?  ANS: Because they don't C#",
            "How do you tell HTML from HTML5?  ANS: 1 Try it out in Internet Explorer. 2 Did it work? 3 No? then its HTML5",
            "Real programmers count from 0","Chuk Norris writes code... that optimizes itself","A foo walk walks into a ber takes a look around and says HELLO WORLD"

    };

    public static String getJoke() {
        int randomNumber = new Random().nextInt(jokes.length - 1);
        return jokes[randomNumber];
    }
}