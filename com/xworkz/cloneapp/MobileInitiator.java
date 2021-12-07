package com.xworkz.cloneapp;

public class MobileInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Mobile mobile=new Mobile();
		 mobile.setName("Realme 5pro");
		 mobile.setBrand("Oppo");
		 mobile.setPrize(15000);
		 mobile.setRAM(8);
		 mobile.setROM(120);
		 
		 Mobile mobile1=(Mobile)mobile.clone();
		 System.out.println(mobile1);
				 

	}

}
