package com.xworkz.cloneapp;

public class ShoppingMallInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
		 
		ShoppingMall mall=new ShoppingMall();
		mall.setName("Matri Mall");
        mall.setNoOfFloors(5);
        mall.setLocation("No 1, Sampige Rd, Malleshwaram, near Central bus stop, Bengaluru");
        mall.setNoOfShops(80);
        mall.setIsOpen(true);
         
        ShoppingMall mall1=(ShoppingMall)mall.clone();
        System.out.println(mall1);
	}

}
