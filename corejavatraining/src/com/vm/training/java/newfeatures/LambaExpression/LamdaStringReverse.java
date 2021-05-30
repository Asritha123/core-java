package com.vm.training.java.newfeatures.LambaExpression;
@FunctionalInterface
interface StringReverse{
	String Reverse(String s);
	
}

public class LamdaStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringReverse  stringreverse =(s)->
	    {
	    	StringBuilder s1=new StringBuilder(s);
	    	s=s1.reverse().toString();
	    	
	    	return s+","+"length is "+s.length();
	    };
	    System.out.println("reverse of string is "+stringreverse.Reverse("abcd"));
	}

}
/*
 * @FunctionalInterface interface String { void reverse(String a ,String b); }
 * interface String1 { void strlength(String a); } public class
 * LengthOfTheStringUsingLambaExpressions { public static void main(String[]
 * args) { String s= (a,b)-> { StringBuilder sb = new StringBuilder();
 * sb.reverse(); System.out.println(sb); }; String1 s1 =(a)-> {
 * System.out.println(a.toString()); };
 * 
 * } }
 */