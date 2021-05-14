package com.jps.springdemo.app;

import org.springframework.stereotype.Component;

@Component("funnyCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Practice your backhand volley!";
	}

}
