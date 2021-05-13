package com.jps.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println("Diagnostic messages end here...");
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
	
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
