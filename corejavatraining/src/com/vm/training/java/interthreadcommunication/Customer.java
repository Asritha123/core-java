package com.vm.training.java.interthreadcommunication;

public class Customer {
	int Balance=5000;
	synchronized public int withdraw(int amount)
	{
		if(Balance<amount)
		{
			System.out.println("you dont have sufficent balance");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println(Thread.currentThread().getName()+" is going to withdraw");
		Balance-=amount;
		return Balance;
	}
	synchronized public int deposit(int amount)
	{
		Balance+=amount;
		System.out.println(Thread.currentThread().getName()+" is going to deposit");
		notifyAll();
		return Balance;
	}

}
