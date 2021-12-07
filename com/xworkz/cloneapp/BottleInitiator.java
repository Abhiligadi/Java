package com.xworkz.cloneapp;

public class BottleInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Bottle bottle =new Bottle();
		 bottle.setName("Cello");
		 bottle.setPrize(179);
		 bottle.setColor("Black");
		 bottle.setLengthInCM(30);
		 
		 Bottle bottle1=(Bottle)bottle.clone();
		 System.out.println(bottle1);
		 
	}

}
