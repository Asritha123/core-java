package com.vm.training.java.assignments;
import java.util.*;
public class Assignment1 {
public static void main(String[] args) {

      @SuppressWarnings("resource")
	Scanner in=new Scanner(System.in); 
      int number=in.nextInt();
    if(number>0) 
     {
     System.out.println("Number is positive");
     }
    else if (number<0) 
     {
     System.out.println("Number is Negitive");
     }
   else{
    System.out.println("Neither Positive Nor Negitive");
}
}
}