package com.vm.training.java.oops;

public class BMW extends Car{
	BMW(String model)
	{
		super(model);
	}

	@Override
	void ac() {
		// TODO Auto-generated method stub
		System.out.println("split ac");
		
	}

	@Override
	void indicators() {
		// TODO Auto-generated method stub
		System.out.println("regular and the rear mirrors");
		
	}

}
