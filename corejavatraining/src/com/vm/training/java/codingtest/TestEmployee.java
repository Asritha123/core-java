package com.vm.training.java.codingtest;
import java.util.Scanner;
public class TestEmployee {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
    System.out.print("enter firstname : ");
    String firstname=sc.next();
    System.out.print("enter lastname : ");
    String lastname=sc.next();
		
		Employee emp=new Employee(firstname,lastname);
		
		emp.Validation();
		
	}

}