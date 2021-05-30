package com.vm.training.java.exception;

public class ProductDamaged {

String message;
ProductDamaged(String message)
{
	this.message=message;
}

public String toString() {
	return message;
}
}