package com.nila2.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoAppMain {

	public static void main(String[] args) {
		// Load spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive bean from spring container
				Coach theCoach=context.getBean("tennisCoach",Coach.class);
		        Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		        
		        boolean result=(theCoach==alphaCoach);
		        System.out.println("For same object: "+result);
		        System.out.println("\nMemory loc. For theCoach: "+theCoach);
		        System.out.println("\nMemory loc. For alphaCoach: "+alphaCoach+"\n");
		context.close();        
	}

	

}
