package com.vm.training.java.collections;
import java.util.ArrayList;
public class Wrestler {
private float weight;
private String name;
private float height;

public Wrestler(float weight, String name, float height) {
	super();
	this.weight = weight;
	this.name = name;
	this.height = height;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public float getHeight() {
	return height;
}

public void setHeight(float height) {
	this.height = height;
}

@Override
public String toString() {
	return "Wrestler [weight=" + weight + ", name=" + name + ", height=" + height + "]";
}

}
	






