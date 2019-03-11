package com.nila2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file		
		ClassPathXmlApplicationContext context= 
		new ClassPathXmlApplicationContext ("applicationContext.xml");
		// retrieve bean from spring container
		BaseballCoach theCoach= context.getBean("myBaseballCoach",BaseballCoach.class);
		// call methods on the bean
			System.out.println(theCoach.getDailyWorkOut());	
			System.out.println(theCoach.getDailyFortune());	
			
			//Call new methods to get the literal values
			System.out.println(theCoach.getEmailAddress());
			System.out.println(theCoach.getTeam());
		// close the context
  context.close();
	}
}




