package com.xworkz.sbiatm;

public class SbiImplimentation implements   ICard{

	@Override
	public void swapCard() {
		 System.out.println("your card is swipping");
	}

	@Override
	public void insertCard() {
		 System.out.println("your card is inserted");
		
	}
	
     
}
