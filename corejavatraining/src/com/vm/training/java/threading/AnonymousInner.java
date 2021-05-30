package com.vm.training.java.threading;

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1= new Parent();
		p1.phone();
		Parent p2 = new Parent();
		{
			void phone()
			{
				System.out.println("i phone");
			}
		};
		p2.phone();

	}

}
