package com.vm.training.java.oops;

public class InheritanceGetterSetter {

	public static void main(String[] args) {
		
	
				Inheritance inherit = new Inheritance();
				InheritanceDetails inheritDetails = new InheritanceDetails();
				InheritancePersonalDetails inheritPersonalDetails = new InheritancePersonalDetails();
				inherit.setId(1035);
				inherit.setName("Asri");
				inherit.setDept("CSE");
				inheritDetails.setMailid("Asri@gmail.com");
				inheritDetails.setMobile("949432199");
				inheritDetails.setAddress("Vijayawada");
				inheritPersonalDetails.setNationality("INDIAN");
				
				
				
				System.out.println(inherit.getId());
				System.out.println(inherit.getName());
				System.out.println(inherit.getDept());
				System.out.println(inheritDetails.getMailid());
				System.out.println(inheritDetails.getMobile());
				System.out.println(inheritDetails.getAddress());
				System.out.println(inheritPersonalDetails.getNationality());
				
				
			}

		

		// TODO Auto-generated method stub

	}


