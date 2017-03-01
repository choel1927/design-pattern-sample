package com.choel.designpattern.domain.model.operation;

public class OperationSubstract implements Strategy {

	@Override
	public int operation(int x, int y) {
		return x - y;
	}

}
