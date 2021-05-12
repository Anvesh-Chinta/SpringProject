package com.jps.springdemo;

public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Three rounds followed by net practice!";
		
	}

	@Override
	public String getDailyFortune() {
		
		return "YOur tema shall win the mathc!";
	}

}
