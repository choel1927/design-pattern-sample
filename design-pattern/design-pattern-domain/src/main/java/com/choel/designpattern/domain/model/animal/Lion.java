package com.choel.designpattern.domain.model.animal;

import org.springframework.stereotype.Service;

@Service("lion")
public class Lion implements WildAnimal {

	@Override
	public String sound() {
		return "Roar";
	}

}
