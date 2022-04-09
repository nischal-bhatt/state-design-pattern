package com.coffeepoweredcrew.state;

public class New implements OrderState{

	@Override
	public double handleCancellation() {
		System.out.println("It's a new order - No processing is going to be done");
		return 0;
	}

	
}
