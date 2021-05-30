package com.vm.training.java.strings;

class StringObjectCreation
{
	public static void main(String[] args)
	{
		String s1 = new String("value momentum");//string constructor
		String s2 =("value momentum");//string literal
		String s3 =("sudhaksha");
		/*
		 * System.out.println(s1 == s2);// equals operator
		 * System.out.println(s1.equals(s2)); System.out.println(s2.equals(s3));
		 */
		System.out.println(s1.concat(s3));
		System.out.println(s1);
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.length());
		System.out.println(s3);
		System.out.println(s1.charAt(2));
		System.out.println(s1.intern() == s3.intern());
		System.out.println(s1.intern() == s2.intern());
		//System.out.println(s1.concat(s2));
		s1=s1.concat(s3);
		

	}
}