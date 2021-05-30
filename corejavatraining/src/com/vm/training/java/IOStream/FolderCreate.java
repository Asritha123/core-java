package com.vm.training.java.IOStream;



import java.io.File;
import java.io.IOException;

public class FolderCreate {

	public static void main(String[] args){
		// TODO Auto-generated method stub
File f = new File("A");
		
		System.out.println(f.exists());
		f.mkdir();
	    System.out.println(f.exists());
	}

	

}


