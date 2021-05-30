package com.vm.training.java.oops;

public class Bus implements IVehicle {

	@Override
	public void Steering() {
		// TODO Auto-generated method stub
		System.out.println("Power Steering");
		
	}

	@Override
	public void Breaks() {
		// TODO Auto-generated method stub
		System.out.println("Volvo Breaks");
	}

	@Override
	public void Accelerator() {
		// TODO Auto-generated method stub
		System.out.println("Based On Weight");
	}

	@Override
	public void Clutches() {
		// TODO Auto-generated method stub
		System.out.println("Based On Gears");
	}

	@Override
	public int Gears() {
		// TODO Auto-generated method stub
		return 6;
	}
	

}
