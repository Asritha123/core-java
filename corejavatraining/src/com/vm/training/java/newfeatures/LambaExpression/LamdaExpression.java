package com.vm.training.java.newfeatures.LambaExpression;



interface Test
{
	void diaplay();
}
public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Test t = ()->
 {
	 System.out.println("hello");
	 System.out.println("java");
	 
 };
 t.diaplay();
 //---------------------------
 Test t1 = ()->System.out.println("hello single line body");
 t1.diaplay();
	}

}
