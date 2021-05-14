package com.jps.springdemo.app;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Cone weave to Zigzag weave - both feet\n 4 Sets - 10-15 Reps";
	
	}

}
