package com.nila2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAppMain {

	public static void main(String[] args) {
		// Read spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		// Get bean from Spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		// Call method on bean
	    System.out.println(theCoach.getDailyWorkOut());
		// Close context
	    System.out.println(theCoach.getDailyFortune());
	    
  context.close();
	}

}
