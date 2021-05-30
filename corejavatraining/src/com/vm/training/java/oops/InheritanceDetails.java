package com.vm.training.java.oops;

public class InheritanceDetails extends Inheritance {
	
	
	String mailid;
	String mobile;
	String address;
	
	
	
	/*
	 * public InheritanceDetails(int id,String name,String dept,String mailid,
	 * String mobile, String address) { super(id,name,dept); this.mailid = mailid;
	 * this.mobile = mobile; this.address = address;
	 */
	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	}
	
	/*
	 * public String toString() { return
	 * id+" "+name+" "+dept+" "+mailid+" "+mobile+" "+address; }
	 */
	/*
	public static void main(String[] args)
	{
		InheritanceDetails InheritDet =new InheritanceDetails(100,"asri","cse","asri@gmail.com","9494320199","vijayawada");
		System.out.println(InheritDet);
				
		
		
	}
*/

