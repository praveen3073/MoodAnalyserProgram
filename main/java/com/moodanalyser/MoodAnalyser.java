package com.moodanalyser;

enum MoodAnalyserErrorMessage {
    NULLMESSAGE("Null Mood Error"), EMPTYMESSAGE("Empty Mood Error");
    private final String message;

    MoodAnalyserErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

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

    protected String analyseMood() throws MoodAnalysisException {
        try {
            if (message.isEmpty()) {
                throw new MoodAnalysisException(MoodAnalyserErrorMessage.EMPTYMESSAGE.getMessage(), "HAPPY");
            } else if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalyserErrorMessage.NULLMESSAGE.getMessage(), "HAPPY");
        } catch (MoodAnalysisException e) {
            throw e;
        }
    }
}
