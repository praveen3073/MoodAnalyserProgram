package com.moodanalyser;

public class MoodAnalysisException extends RuntimeException{
    final String mood;
    public MoodAnalysisException(String message, String mood) {
        super(message);
        this.mood = mood;
    }
    public String getMood() {
        return mood;
    }
}
