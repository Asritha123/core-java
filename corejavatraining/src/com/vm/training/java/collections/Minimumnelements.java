package com.vm.training.java.collections;
import java.util.ArrayList;
import java.util.Collections;
public class Minimumnelements {

public static void main(String[] args) {
     ArrayList<Integer> arraylist = new ArrayList<Integer>();
        
        //add elements to ArrayList
     arraylist.add(30);
     arraylist.add(40);
     arraylist.add(50);
     arraylist.add(60);
     arraylist.add(70);
     
 
        System.out.println( "ArrayList Minimum Value: " + Collections.min(arraylist) );
  
        System.out.println( "ArrayList Maximum Value: " + Collections.max(arraylist) );
 
    }
}