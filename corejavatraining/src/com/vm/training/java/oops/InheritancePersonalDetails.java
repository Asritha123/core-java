package com.vm.training.java.oops;

public class InheritancePersonalDetails extends InheritanceDetails{
	
		String nationality;

		/*
		 * public InheritancePersonalDetails(int id, String name, String dept, String
		 * mailid, String mobile, String address,String nationality) { super(id, name,
		 * dept, mailid, mobile, address); this.nationality = nationality; }
		 */

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		@Override
		public String toString() {
			return "InheritancePersonalDetails [nationality=" + nationality + ", mailid=" + mailid + ", mobile="
					+ mobile + ", address=" + address + ", id=" + id + ", name=" + name + ", dept=" + dept + "]";
		} 
		/*
		 * public static void main(String[] args) { InheritancePersonalDetails ipd = new
		 * InheritancePersonalDetails(1035,"asri","cse","asri@good.com","9494320199",
		 * "Vijayawada","Indian"); System.out.println(ipd);
		 * 
		 * }
		 */
}

		
