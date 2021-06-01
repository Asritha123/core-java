package com.vm.training.java.codingtest;

import java.util.Scanner;
public class TestSavingAccount {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		SavingAccount savings=new SavingAccount(7000,0.06);
		savings.withdraw(100);
		savings.deposit(400);
		System.out.println("Current Balance in Saving Account :"+savings.getBalance());


	}

}