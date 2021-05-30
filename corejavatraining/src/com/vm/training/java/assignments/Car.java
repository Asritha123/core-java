package com.vm.training.java.assignments;

public class Car {
	int yearModel;
int speed;
public Car(int yearModel, int speed) {
	super();
	this.yearModel = yearModel;
	this.speed = speed;
}
public int getYearModel() {
	return yearModel;
}

public int getSpeed() {
	return speed;
}
int brake()
{
	return speed+5;
}
int brake(int speed)
{
	if(speed>=5)
		return speed+5;
	else
		return 0;
}

}
