package com.xworkz.cloneapp;

public class TravelsInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Travels travels=new Travels();
		 travels.setName("Sai travels");
		 travels.setOwner("Bhakthavalsalam");
		 travels.setNoOfBuses(400);
		 travels.setStartedYear(2007);
		 
		 
		 Travels travels1=(Travels)travels.clone();
		 System.out.println(travels1);

	}

}
