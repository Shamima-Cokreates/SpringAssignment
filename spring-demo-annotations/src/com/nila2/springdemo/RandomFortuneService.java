package com.nila2.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create array of Strings
	private String[] data= {"A","B","C"};
	
	//Create random number generator
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from array
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
