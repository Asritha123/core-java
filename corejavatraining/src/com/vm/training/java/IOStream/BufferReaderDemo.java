package com.vm.training.java.IOStream;


import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo 
{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("asri.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		String read=br.readLine();
		while(read!=null)
		{
			System.out.println(read);
			read=br.readLine()
;		}
		
	}

}