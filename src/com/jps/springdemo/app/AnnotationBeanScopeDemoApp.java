package com.jps.springdemo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		//call methods on the bean
		System.out.println("Pointing to the same location: " + result);
		
		System.out.println("Memory location for theCoach: " + theCoach);
		
		System.out.println("Memory location for alphaCoach: " + alphaCoach );
		
		//close the context
		context.close();
	}
	
}
