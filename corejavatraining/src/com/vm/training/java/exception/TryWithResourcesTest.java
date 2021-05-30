package com.vm.training.java.exception;
import java.io.*;
public class TryWithResourcesTest {
	public static void main(String[] args)
	{
		try(FileOutputStream fos = new FileOutputStream(new File("C:\\vm\\Asri.txt"));Connection con = DriverManager.getConnection("url","un","psw"))
		{
		
			String s ="ValueMomentum";
			byte[] by = s.getBytes();
			fos.write(by);
			System.out.println("success");
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}
	
		}
	}



