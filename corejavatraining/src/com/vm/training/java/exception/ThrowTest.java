package com.vm.training.java.exception;

class Training
{
	void train() throws Exception
	{
		System.out.println("Donot zero knowledge");
	}
}
public class ThrowTest {
	 public static void main(String[] args)
	 {
		 Training training = new Training();
		 try {
			 training.train();
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }

}
