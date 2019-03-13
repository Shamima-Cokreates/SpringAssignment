package com.nila2.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService; //field injection
	
	//define a default constructor
	public TennisCoach() {
		System.out.println(">>TennisCoach: inside default constructor");
	}
	
	//define init method
	@PostConstruct
	public void setInitmethod() {
		System.out.println(">>TennisCoach: inside setInitmethod() meethod-- @PostConstruct ");
	}
	
	
	
	//define destroy method
	
	@PreDestroy
	public void setdestroymethod() {
		System.out.println(">>TennisCoach: inside setDestroymethod() meethod-- @PreDestroy ");
	}
	
	
	
	
	
	
	
	
	
	
	/*
	@Autowired
	public void setAnyMethod(FortuneService theFortuneService) {
		System.out.println(">>TennisCoach: inside setAnyMethod() method--autowired for method injection");
		fortuneService=theFortuneService;
	}
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService=theFortuneService;
	} */
	
	
	public String getDailyWorkOut() {
	
		return "Inversion of Control with Java Annotations-- inside getDailyWorkOut() method ";
	}

	@Override
	public String getDailyFortune() {
		// 
		return fortuneService.getFortune();
	}

}
