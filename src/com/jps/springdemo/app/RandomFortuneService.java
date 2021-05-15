package com.jps.springdemo.app;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	String[] data = {
			"Beware of the wolf in sheep's clothing",
			"Dilligence is the mother of good luck",
			"The journey is the reward"
	};
	
	//create a random number generator
	private Random random = new Random();
	int index = random.nextInt(data.length);
	
	@Override
	public String getFortune() {
		
		String theFortune = data[index];
		return theFortune;
		
	}

}
