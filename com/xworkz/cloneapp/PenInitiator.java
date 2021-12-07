package com.xworkz.cloneapp;

public class PenInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
	   Pen pen=new Pen();
	   pen.setPenName("Brite");
	   pen.setPrize(10);
	   pen.setColor("Black");
	   pen.setLengthInCM(15);
	   
	   Pen pen1=(Pen)pen.clone();
	  System.out.println(pen1);
	}

}
