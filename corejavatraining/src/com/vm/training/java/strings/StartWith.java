package com.vm.training.java.strings;

public class StartWith {

 
    public static void main(String[] args){
     
        String str = "When we take the time to examine the beauty of the world around us";
        System.out.println("Is this string starts with "+"THIS"+" "+str.startsWith("When"));
        System.out.println("Is this string starts with "+"IS"+" " +str.startsWith("is"));
        System.out.println("Is this string starts with "+ " is after INDEX 5 "+str.startsWith("is", 5));
    }
}