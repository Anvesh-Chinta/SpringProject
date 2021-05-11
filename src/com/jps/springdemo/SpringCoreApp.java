package com.jps.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCoreApp {

	public static void main(String[] args) throws Exception{
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}
}
