package com.vm.training.java.collections.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentsMarks {
	static int highestMarks(ArrayList<Integer>arraylist)
	{
		int maximum = Collections.max(arraylist);
		return maximum;
	}
	static double averageMarks(ArrayList<Integer>arraylist)
	{
		int sum=0;
		for(Integer a:arraylist)
		{
			sum+=a;
		}
		return(sum/arraylist.size());
	}
public static void main(String[] args) 
{
    int a, totalmarks = 0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of subject:");
    a = sc.nextInt();
    ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
    int marks[] = new int[a];
    System.out.println("Enter marks:");
    for(int i = 0; i < a; i++)
    {
        marks[i] = sc.nextInt();
        totalmarks = totalmarks + marks[i];
    }
    System.out.println("Sum:"+totalmarks);
    
    System.out.println(arraylist1);
    
} 

}