package com.vm.training.java.collections;
import java.util.ArrayList;
import java.util.*;

public class EmptySet {

public static void main(String[] args)
{
	

 HashMap<String, Integer> numbers = new HashMap<>();
numbers.put("One", 1);
numbers.put("Two", 2);
numbers.put("Three", 3);
System.out.println("HashMap: " + numbers);

// access all keys  of the HashMap
System.out.print("Keys: ");

// keySet() returns a set view of all keys
// for-each loop access each key from the view
for(String key: numbers.keySet()) {

	// print each key
	System.out.print(key + ", ");
}
Set<String> EmptySet = Collections.emptySet();  
System.out.println("Created empty immutable Set: "+EmptySet);  
//Try to add elements  
EmptySet.add("A");  
EmptySet.add("B");
}
}