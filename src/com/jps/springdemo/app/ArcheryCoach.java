package com.jps.springdemo.app;


public class ArcheryCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "One-arm Dumbbell Lateral Raises";
	}

	@Override
	public String getDailyFortune() {
		
		return null;
	}

}
