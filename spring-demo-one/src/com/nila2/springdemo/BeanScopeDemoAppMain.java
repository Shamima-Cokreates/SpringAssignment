package com.nila2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoAppMain {

	public static void main(String[] args) {

		// load the spring configuration file
				ClassPathXmlApplicationContext context =
						new ClassPathXmlApplicationContext("beanScopeapplicationContext.xml");
		//Retrieve bean from spring container
Coach theCoach=context.getBean("myCoach",Coach.class);
Coach alphaCoach=context.getBean("myCoach",Coach.class);
//check if they are same
boolean result= (theCoach==alphaCoach);

//print result
System.out.println("\n pointing to the same object: "+result);
System.out.println("\n pointing to the same object: "+theCoach);
System.out.println("\n pointing to the same object: "+alphaCoach+"\n");

context.close();
	}
}
