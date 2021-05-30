package com.vm.training.java.IOStream;

import java.io.File;
import java.io.IOException;
public class Demo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("Ammulu1.txt");
		//File f1 = new File("C:\\Users\\Asrit\\Desktop\\certificates\\mehindi pics\\my pics\\Asri.txt");
		if(f.exists())
		{
		System.out.println("file is present");
		}
		else
		{e
			System.out.println("file is not present we are creating");
		    f.createNewFile();
		    System.out.println("file is created");
		}

	}

}
