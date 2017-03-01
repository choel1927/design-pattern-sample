package com.choel.designpattern.domain.service;

import com.choel.designpattern.domain.model.operation.Strategy;

public class OperationContext {
	private Strategy strategy;
	
	public OperationContext(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(int x, int y) {
		return strategy.operation(x, y);
	}
	
}
