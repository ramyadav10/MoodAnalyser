package com.bridgelabz.moodanalyser.com.bridgelabz.moodanalyser;

public class MoodAnalyserUC2 {
	
	private String message;
	public MoodAnalyserUC2() {
	}
	public MoodAnalyserUC2(String string) {
		this.message=string;
	}

	public String analyseMood() {
		try {
            if (message.contains("Sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        }catch (NullPointerException e){
            return "HAPPY";
        }
	}

}
