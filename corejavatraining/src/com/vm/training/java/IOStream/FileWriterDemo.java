package com.vm.training.java.IOStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
       File f=new File("asri.txt");
       FileWriter fw=new FileWriter(new File("asri1.txt"));
       fw.write("hello");
       fw.close();
	}
}