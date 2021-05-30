package com.vm.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WrestlerTest {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayList<Wrestler> ar=new ArrayList<Wrestler>();
	ar.add(new Wrestler(6,"Raina",70));
	ar.add(new Wrestler(5,"km",80));
	ar.add(new Wrestler(5,"sk",90));

   System.out.println(ar);
   for(Wrestler wrestler:ar)
   {
	   System.out.println(wrestler);
   }
  
   
   for(Wrestler wrestler:ar)
   {
	   if(wrestler.getHeight()>5)
	   {
	   System.out.println(wrestler.getHeight());
	   }
   }
}
}