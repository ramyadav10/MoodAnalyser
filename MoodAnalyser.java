package com.bridgelabz.moodanalyser.com.bridgelabz.moodanalyser;

public class MoodAnalyser {

	public String analyseMood(String string) {
		if(string.contains("Sad")) {
			return "SAD";
		}else {
			return "HAPPY";
		}
	}

}
