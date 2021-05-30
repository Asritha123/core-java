package com.vm.training.java.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  Employee e=new Employee(1,"asri");
    FileOutputStream fis=new FileOutputStream("asri.txt");
    ObjectOutputStream oos=new ObjectOutputStream(fis);
    oos.writeObject(e);
    System.out.println("done");
    
	}

}