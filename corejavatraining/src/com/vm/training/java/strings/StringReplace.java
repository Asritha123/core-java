package com.vm.training.java.strings;

public class StringReplace {

    public static void main(String a[]){
     
        String str = "i am asritha,and i am from vijaywada";
        System.out.println("Replace char 'a' with 'o':"+str.replace('a', 'A'));
                     
        System.out.println("Replace first occurance of string\"i\" with \"myself\":"+str.replaceFirst("i", "myself"));
                     
        System.out.println("Replacing \"am\" every where with \"polu\":"+str.replaceAll("am", "polu"));
    }
}