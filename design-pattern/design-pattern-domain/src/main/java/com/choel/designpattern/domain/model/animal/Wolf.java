package com.choel.designpattern.domain.model.animal;

import org.springframework.stereotype.Service;

@Service("wolf")
public class Wolf implements WildAnimal {

	@Override
	public String sound() {
		return "Howl";
	}

}
