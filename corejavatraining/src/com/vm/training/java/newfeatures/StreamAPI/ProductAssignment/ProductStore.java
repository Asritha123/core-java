package com.vm.training.java.newfeatures.StreamAPI.ProductAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductStore {
	private static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {
	
      ArrayList<Product> products;
      ProductStorage productstorage = new ProductStorage();
      products=(ArrayList<Product>) productstorage.wareHouse();
      ProductFilters productfilter = new ProductFilters(products);
  
      boolean repeat = true;
      while(repeat)
      {
    	  switch(printMenu())
    	  {
    	  case 1:
    		  productfilter.productCount();
    		  break;
    	  case 2:
    		  System.out.print("Enter Catagery: ");
    		  String catagery=sc.next();
    		  productfilter.productCatogery(catagery);
    		  break;
    	  case 3:
    		  System.out.print("Enter min price: ");
    		  int minp=sc.nextInt();
    		  System.out.print("Enter max price: ");
    		  int maxp = sc.nextInt();
    		  productfilter.productPriceRange(minp, maxp);
    		  break;
    	  case 4:
    		  productfilter.productpricegreater(4000);
    		  break;
    	  case 5:
    		  System.out.print("Sort by:(name/price): ");
    		  String sort =sc.next();
    		  productfilter.productSort(sort);
    		  
    		  break;
    	  case 6:
    		  System.out.print("Enter Quantity: ");
    		  int quantity = sc.nextInt();
    		  System.out.print("Enter Catogery: ");
    		  String catogery = sc.next();
    		  productfilter.productCustomQuery(quantity,catogery);
    		  break;
    	  case 7:
    		  productfilter.productNameUpperCase();
    		  break;
    	  case 8:
    		  System.out.print("Enter Catogery: ");
    		  String cato = sc.next();
    		  productfilter.productCountCatogery(cato);
    		  break;
    	 
    	  }
      }
      
	
}
private static int printMenu()
{
    System.out.println("===========Welcome to Store=============\n");
	System.out.println("1. Product Count");
	System.out.println("2. Product by Catagery");
	System.out.println("3. Product by Price range ");
	System.out.println("4. Product by Price");
	System.out.println("5. Sort Products");
	System.out.println("6. Product by Custom Query");
	System.out.println("7. UpperCase ProductNames");
	System.out.println("8. Product Count by Catogery");
	System.out.println("9. Exit");
	  System.out.println("=====================");
	return sc.nextInt();
}
}
