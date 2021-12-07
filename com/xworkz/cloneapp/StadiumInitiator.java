package com.xworkz.cloneapp;

public class StadiumInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Stadium stadium=new Stadium();
		 stadium.setName("ChinnaSwamy");
         stadium.setContactNumber(9035320895L);
         stadium.setLocation( "Cubbon Rd, Shivaji Nagar, Bengaluru, Karnataka ");
         stadium.setNoOfSeat(40000);
         stadium.setStartedYear(1969);
         
         
         Stadium stadium2=(Stadium)stadium.clone();
         System.out.println(stadium2);
	}

}
