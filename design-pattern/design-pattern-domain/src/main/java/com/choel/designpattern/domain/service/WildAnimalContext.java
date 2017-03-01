package com.choel.designpattern.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.choel.designpattern.domain.model.animal.WildAnimal;

@Service
public class WildAnimalContext {
	@Autowired
	@Qualifier("lion")
	private WildAnimal lion;
	@Autowired
	@Qualifier("wolf")
	private WildAnimal wolf;
	
	public String checkSound(WildAnimalType wildAnimalType) {
		String result = new String();
		switch (wildAnimalType) {
			case LION :
				result = lion.sound();
			break;
			case WOLF :
				result = wolf.sound();
			break;	
		}
		return result;
	}
	
	enum WildAnimalType {
		LION, WOLF
	}
}
