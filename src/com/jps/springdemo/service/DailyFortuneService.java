package com.jps.springdemo.service;

import java.util.Random;

public class DailyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		//define three fortunes in an array
		String[] dailyFortunes =  {"Your team will win todays match!", 
				"Odds are in your favour", 
				"You are no less than others!"
				};
		
		//random fortune from array
		Random random = new Random();
		
		int index = random.nextInt(dailyFortunes.length);
		String theFortune = dailyFortunes[index];
		return theFortune;
	}

}
