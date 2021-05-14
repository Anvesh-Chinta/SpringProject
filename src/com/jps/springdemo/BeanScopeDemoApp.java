package com.jps.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("singleton-beanScope-applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if the objects are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location of theCoach object: " + theCoach);
		
		System.out.println("\nMemory location of theCoach object: " + alphaCoach);
		
	}

}
