package com.vm.training.java.collections;
import java.util.ArrayList;

import java.util.Iterator;
public class OddEven
{

  static void oddsum(ArrayList array)

  {
    Iterator<Integer> it=array.iterator();
    int oddsum=0;
    while(it.hasNext())
    {
      if(it.next()%2!=0)
      {
        oddsum+=it.next();
      }
    }
    System.out.println("Even sum:"+oddsum);
  }
  
  static void evensum(ArrayList array)
  {
    Iterator<Integer> it=array.iterator();
    int evensum=0;
    while(it.hasNext())
    {
      if(it.next()%2==0)
      {
        evensum+=it.next();
      }
    }
    System.out.println("Even sum:"+evensum);
  }
}