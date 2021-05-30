package com.vm.training.java.threading;
class ProjectCall extends Thread
{
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class WorkingOnProject extends Thread
{
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class Presentation extends Thread
{
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}


public class JoinDemo {
	public static void main(String[] args) throws InterruptedException
	{
		ProjectCall projectcall = new ProjectCall();
		WorkingOnProject workingonproject = new WorkingOnProject();
		Presentation presentation = new Presentation();
		
		
		
		 projectcall.setName("project discussion call");
		 workingonproject.setName("working on the project");
		 presentation.setName("presentation");
	
		 
		 
		 workingonproject.start();
		 workingonproject.join();
		 
		 projectcall.start();
		 projectcall.join();
	}

}
