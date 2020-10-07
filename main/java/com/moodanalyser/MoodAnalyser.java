package com.moodanalyser;

public class MoodAnalyser {
    String analyseMood(String message) {
        return "Happy";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Program");
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood("Hello"));
    }
}
