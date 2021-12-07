package com.xworkz.cloneapp;

public class InstituteInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Institute inst=new Institute();
		 inst.setName("X-workz");
		 inst.setOwner("Omkar");
		 inst.setNoOfTrainers(200);
		 inst.setFees(20000);
		 inst.setHR("Rajajimnagar");
		 
		 Institute inst1=(Institute)inst.clone();
		 System.out.println(inst1);
	}

}
