package com.vm.training.java.newfeatures.StreamAPI.ProductAssignment;

import java.util.ArrayList;

public class ProductStorage {
	ArrayList<Product>products = new ArrayList<Product>();

	public ArrayList<Product> wareHouse()
	{
		Product[] product = new Product[7];
		for(int i=0;i<7;i++)
		{
			product[i]= new Product();
		}
		
		product[0].setPid(1241);product[0].setCategory("Electronics");product[0].setPname("oppo");product[0].setPrice(107000.0);product[0].setQuantity(5);
		product[1].setPid(1001);product[1].setCategory("Clothes");product[1].setPname("pink shirt");product[1].setPrice(899.0);product[1].setQuantity(7);
		product[2].setPid(1002);product[2].setCategory("Clothes");product[2].setPname("black shirt");product[2].setPrice(899.0);product[2].setQuantity(9);
		product[3].setPid(2143);product[3].setCategory("Toys");product[3].setPname("Barbie doll");product[3].setPrice(1999.0);product[3].setQuantity(12);
		product[4].setPid(3421);product[4].setCategory("Furniture");product[4].setPname("glass bowls");product[4].setPrice(1998.0);product[4].setQuantity(1);
		product[5].setPid(5621);product[5].setCategory("HouseHold");product[5].setPname("sweeping stick");product[5].setPrice(270.0);product[5].setQuantity(7);


		
		
		for(int i=0;i<7;i++)
		{
			products.add(product[i]);
		}
		return products;
	}
}
