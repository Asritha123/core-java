package com.vm.training.java.realworldexamples.interfaces;

public class HavellsAppliances implements SwitchListener{

	@Override
	public void switchOne() {
		System.out.println("havells fan is running");
	}

	@Override
	public void switchTwo() {
		System.out.println("havells light is running");

	}

	@Override
	public void switchThree() {
		System.out.println("havells bulb is running");

	}

	@Override
	public void switchFour() {
		System.out.println("havells bell is running");

	}

	@Override
	public void wifiSwitch() {
		System.out.println("havells wifi is running");
		// TODO Auto-generated method stub
		
	}

}