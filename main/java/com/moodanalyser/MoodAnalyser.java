package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public MoodAnalyser() {

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Program");
    }

    protected String analyseMood() {
        try {
            if (message.equals("I am in Sad Mood"))
                return "SAD";
            else
                return "HAPPY";
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return null;
    }
}
