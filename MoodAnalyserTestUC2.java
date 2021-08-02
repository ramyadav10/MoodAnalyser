package com.bridgelabz.moodanalyser.com.bridgelabz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTestUC2 {

	@Test
    public void givenMessage_whenSad_ShouldReturnSad() {
        MoodAnalyserUC2 moodAnalyser2 = new MoodAnalyserUC2("I am in Sad Mood");
        String mood = moodAnalyser2.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_whenhappy_ShouldReturnHappy() {
    	MoodAnalyserUC2 moodAnalyser2 = new MoodAnalyserUC2("I am in Any Mood");
        String mood = moodAnalyser2.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_whennull_ShouldReturnHappy() {
    	MoodAnalyserUC2 moodAnalyser2 = new MoodAnalyserUC2(null);
        String mood = moodAnalyser2.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

}
