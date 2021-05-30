package com.vm.training.java.interthreadcommunication;

public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Customer customer = new Customer();
     Thread t1 = new Thread()
     {
    	 public void run()
    	 {
    		 System.out.println(customer.withdraw(7000));
    	 }
     };
     Thread t2 = new Thread()
     {
    	 public void run()
    	 {
    		 System.out.println(customer.deposit(2000));
    	 }
     };
     t1.setName("withdraw:-");
     t2.setName("deposit:-");
     

     t1.start();
     t2.start();
	}

}
