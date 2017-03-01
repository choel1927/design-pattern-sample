package com.choel.designpattern.domain.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.choel.designpattern.domain.model.operation.OperationAdd;
import com.choel.designpattern.domain.model.operation.OperationMultiply;
import com.choel.designpattern.domain.model.operation.OperationSubstract;

public class OperationContextTest {
	
	@Test
	public void executeStrategyAddTest() {
		OperationContext context = new OperationContext(new OperationAdd());
		int expectation = 15;
	    int result = context.executeStrategy(10, 5);
	    
	    assertEquals(expectation, result);
	}
	
	@Test
	public void executeStrategySubstractTest() {
		OperationContext context = new OperationContext(new OperationSubstract());
		int expectation = 5;
		int result = context.executeStrategy(10, 5);
		
		assertEquals(expectation, result);
	}
	
	@Test
	public void executeStrategyMultiplyTest() {
		OperationContext context = new OperationContext(new OperationMultiply());
		int expectation = 50;
		int result = context.executeStrategy(10, 5); 
	    
	    assertEquals(expectation, result);
	}
	
}
