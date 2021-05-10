package com.jps.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}
}
