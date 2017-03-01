package com.choel.designpattern.domain.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class WildAnimalContextTest {
	@Autowired
	private WildAnimalContext context;
	
	@Test
	public void checkSoundLion() {
		String expectation = "Roar";
		String result = context.checkSound(WildAnimalContext.WildAnimalType.LION);
		assertEquals(expectation, result);
	}
	
	@Test
	public void checkSoundWolf() {
		String expectation = "Howl";
		String result = context.checkSound(WildAnimalContext.WildAnimalType.WOLF);
		assertEquals(expectation, result);
	}
	
}
