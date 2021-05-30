package com.vm.training.java.newfeatures.LambaExpression;

interface Bank
{
	default void openAccount()
	{
		System.out.println("you can open acc online");
	}
	static void holiday()
	{
		System.out.println("holiday on 2 and 4 saturday");
	}
	abstract int rateOfInterest(int interest);
	abstract int minBalance(int amount);
	
}
class Axis implements Bank
{

	@Override
	public int rateOfInterest(int interest) {
		// TODO Auto-generated method stub
		return interest;
	}

	@Override
	public int minBalance(int amount) {
		// TODO Auto-generated method stub
		return amount;
	}
	
	
}
public interface NewInterfaceDemo {
	public static void main(String[] args)
	{
		Bank bank = new Axis();
		bank.openAccount();
		bank.minBalance(1000);
		//bank.rateOfInterest(i);
		System.out.println("minimum balance:"+bank.minBalance(10000));
		System.out.println("interest rate:"+bank.rateOfInterest(4));
		
	}

}
