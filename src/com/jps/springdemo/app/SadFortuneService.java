package com.jps.springdemo.app;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {

		return "My birthday was yesterday, I am sad day";

	}

}
