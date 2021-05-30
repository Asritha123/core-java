package com.vm.training.java.oops;

public class TestInterface {
	public static void main(String[] args)
	{
		IVehicle Vehicle = new Bus();//abstraction as well as loose coupling
		IVehicle v = new Bus();
		Vehicle.Steering();
		Vehicle.Breaks();
		Vehicle.Accelerator();
		Vehicle.Clutches();
		Vehicle.Gears();
		Car car = new BMW("Safari");
		car.ac();
		car.indicators();
	    car.Steering();
		car.Breaks();
		car.Clutches();
		car.Gears();
		
	}

}
