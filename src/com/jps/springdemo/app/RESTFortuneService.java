package com.jps.springdemo.app;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService{

	//create an array of String
	String data[] = {
			"You can learn so much from people who are different from you.",
			"You have a good reason to be self-confident",
			"You will do well to advance your career"
	};
	
	//create a random number generator
	Random random = new Random();
	int index = random.nextInt(data.length);
	
	@Override
	public String getFortune() {
		String theFortune = data[index];
		return theFortune;
	}

}
