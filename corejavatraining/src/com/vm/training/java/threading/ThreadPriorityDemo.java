package com.vm.training.java.threading;

public class ThreadPriorityDemo {
 public static void main(String[] args) {
 Asritha maniteja1=new Asritha();
 Asri asri 
  System.out.println(maniteja1.getPriority());
 
  maniteja1.setName("maniteja");
 
  maniteja1.setPriority(Thread.MAX_PRIORITY);

  maniteja1.start();

 }
}