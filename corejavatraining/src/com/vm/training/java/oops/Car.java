package com.vm.training.java.oops;

public abstract class Car implements IVehicle 
{
 String model;
  Car(String model)
  {
	  this.model=model;
  }
 
	@Override
	public void Steering() {
		// TODO Auto-generated method stub
		System.out.println("Power Steering");
	}

	@Override
	public void Breaks() {
		// TODO Auto-generated method stub
		System.out.println("Disk Breaks");
		
	}

	@Override
	public void Accelerator() {
		// TODO Auto-generated method stub
		System.out.println("no idea");
		
	}

	@Override
	public void Clutches() {
		// TODO Auto-generated method stub
		System.out.println("Based on gears");
	}

	@Override
	public int Gears() {
		// TODO Auto-generated method stub
		return 5;
	}
	abstract void ac();
	abstract void indicators();

}
