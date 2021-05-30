package com.vm.training.java.threading;
class Asritha extends Thread
	{
		public void run()
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("Asritha"+i);
			}
		}
	}
class mohana extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("mohana"+i);
		}
	}
}
class geetha extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("geetha"+i);
		}
	}
}

public class MultiTaskingDemo {
	
  public static void main(String[] args)
  {
	  Asritha asri = new Asritha();
	  mohana mohana = new mohana();
	  geetha geetha=new geetha();
	  
	 // asri.run();
	  //mohana.run();
	  //geetha.run();
	  
	  asri.start();
	  mohana.start();
	  geetha.start();
	  
  }
}
