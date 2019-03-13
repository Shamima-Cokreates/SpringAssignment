package com.nila2.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoAppMain {

	public static void main(String[] args) {
		// Read spring config java class
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		// Get bean from Spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		// Call method on bean
	    System.out.println(theCoach.getDailyWorkOut());
		// Close context
	    System.out.println(theCoach.getDailyFortune());
	    
  context.close();
	}

}
