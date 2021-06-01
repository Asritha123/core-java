package com.vm.training.java.codingtest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class WWEWrestler
{
public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList<WWE> arraylist=new ArrayList<WWE>();
			
		     arraylist.add(new WWE("Sakshi","Malik",296));
             arraylist.add(new WWE("sushil","kumar",80));
			 arraylist.add(new WWE("suresh","raina",90));
			 
			 System.out.println("list:"+arraylist);
				arraylist.forEach(a->System.out.println(a));
				
			 Stream<WWE> stream = arraylist.stream();
             long count = stream.count();
             System.out.println("totalnumber of wrestlers = " + count);
		        
		     // arraylist.stream().filter(a->a>200).forEach(a->System.out.println(a));
		        System.out.println("wrestlers whose weight is above 200");
				System.out.println(arraylist.stream().filter(s->s.getWeight()>200).count());
				System.out.println("FirstName of all wrestlers are: ");
				 printFirstName(arraylist).forEach(s->System.out.println(s));
				 System.out.println("wrestlers sorted by firstname :");
				 sortbyFirstName(arraylist).forEach(s->System.out.println(s.getFirstName()));
				 private static List<String> printFirstName(List <WWE> list)
					{
						 return list.stream().map(p->p.getFirstName()).collect(Collectors.toList());
						
					}
					private static List<WWE> sortbyFirstName(List <WWE> list)
					{
						 return list.stream().sorted(Comparator.comparing(WWE::getFirstName)).collect(Collectors.toList());
					}


					

		        	
		        
			   

	}

}
