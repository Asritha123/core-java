package com.vm.training.java.strings;

public class LastIndex {
    public static void main(String a[]){
     
        String str = "When we take the time to examine the beauty of the world around us";
        System.out.println("Basic lastIndexOf() example");
        System.out.println("Char 'e' at last occurance: "+str.lastIndexOf('s'));
        System.out.println("String \"this\" at last occurance: "+str.lastIndexOf("this"));
       System.out.println("first occurance of char 'e' from 24th index backwards: "
                            +str.lastIndexOf('s',24));
        System.out.println("First occurance of String \"this\" from 26th index backwards: "
                            +str.lastIndexOf("this",26));
    }
}