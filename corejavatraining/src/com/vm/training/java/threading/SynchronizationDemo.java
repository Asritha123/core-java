package com.vm.training.java.threading;

class Bottle
{
	synchronized public void drink(int time)
	{
		for(int i=1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+"is drinking"+ i);
			
		}
	}
}
class DrinkWater implements Runnable
{
	Bottle bottle = new Bottle();
	public void run()
	{
		bottle.drink(6);
	}
	
}
public class SynchronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrinkWater drinkwater = new DrinkWater();
		Thread.asri=new Thread(DrinkWater);
		

	}

}
