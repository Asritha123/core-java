package com.vm.training.java.collections;
import java.util.*;

public class RemoveDuplicate {
 public static void main(String[] args)
 {
	 ArrayList<String> ludobatch= new ArrayList<String>();
	 ArrayList<String> queensbatch= new ArrayList<String>();
	 ludobatch.add("asri");
	 ludobatch.add("sree");
	 ludobatch.add("ammulu");
	 
	 queensbatch.add("asri");
	 queensbatch.add("janu");
	 queensbatch.add("neha");
	 
	 ludobatch.removeAll(queensbatch);
	 ludobatch.addAll(queensbatch);
	 Collections.sort(ludobatch);
	 System.out.println(ludobatch);
 }
}  
