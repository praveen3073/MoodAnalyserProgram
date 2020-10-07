package com.moodanalyser;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void givenMessage_WhenSadMood_ShouldReturnSAD() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD", result);
    }

    @Test
    public void givenMessage_WhenNotSadMood_ShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", result);
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnHAPPY() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String result = null;
        try {
            result = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            result = e.getMood();
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", result);
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturnMoodAnalysisException() throws MoodAnalysisException{
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        expectedEx.expect(MoodAnalysisException.class);
        expectedEx.expectMessage("Null Mood Error");
        moodAnalyser.analyseMood();
    }
}
