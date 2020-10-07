package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void givenMessage_WhenNotSadMood_ShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", result);
    }
}
