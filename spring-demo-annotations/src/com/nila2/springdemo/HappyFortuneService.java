package com.nila2.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	public String getFortune() {
	
		return "Today is your lucky day!--inside getDailyFortune()-method i.e Our fortune";
	}

}
