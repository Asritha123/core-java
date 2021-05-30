package com.vm.training.java.newfeatures.LambaExpression;


//::
interface validate
{
	void validateLogin();
}
class car
{
	void myLogin()
	{
		System.out.println("you can use username and password ");
	}
}

public class MethodReferenceDemo {
public static void main(String[] args)
{
	validate v=()->System.out.println("login validation");
	v.validateLogin();
	car c = new car();
	validate v1 =c::myLogin;
	v1.validateLogin();
	
	
}
}
