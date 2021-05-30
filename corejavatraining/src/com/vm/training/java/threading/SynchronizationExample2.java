package com.vm.training.java.threading;
class Account
{
	 public void balance(int time)
	{
		 synchronized (this)
		 {
		
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+"is updating"+ i);
			
		}
		}
		for(int i=0;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+"can apply for loan"+ i);
		}
	}

}
class Transaction implements Runnable
{
	Account acc = new Account();
	public void run()
	{
		acc.balance(6);
	}
	
}
public class SynchronizationExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction transaction = new Transaction();
		Thread deposit = new Thread(transaction);
		Thread withdraw = new Thread(transaction);
		deposit.setName("deposit");
		withdraw.setName("withdraw");
		
		
		deposit.start();
		withdraw.start();
		

	}

}
