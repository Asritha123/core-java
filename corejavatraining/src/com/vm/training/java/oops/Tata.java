package com.vm.training.java.oops;

public class Tata extends Car{

	Tata(String model)
	{
		super(model);
	}
	@Override
	void ac() {
		// TODO Auto-generated method stub
		System.out.println("front AC");
		
	}

	@Override
	void indicators() {
		// TODO Auto-generated method stub
		System.out.println("regular indicators");
		
	}
	

}
