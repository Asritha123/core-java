package com.vm.training.java.assignments;
import java.util.*;
public class TryCatch {
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			try
			{
				sleep(5000);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Name ="+Thread.currentThread().getName());
		}
	}

}
