package com.jps.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from Spring container
		Coach theCoach = context.getBean("funnyCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close the context
		context.close();
		
	}

}
