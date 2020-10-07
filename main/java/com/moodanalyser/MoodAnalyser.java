package com.moodanalyser;

public class MoodAnalyser {
    protected String analyseMood(String message) {
        if(message.equals("I am in Sad Mood"))
            return "SAD";
        else
            return "HAPPY";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Program");
    }
}
