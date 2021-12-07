package com.xworkz.cloneapp;

public class Institute implements Cloneable{
   
	private String name;
	private String Owner;
	private int NoOfTrainers;
	private int fees;
	private String HR;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public int getNoOfTrainers() {
		return NoOfTrainers;
	}
	public void setNoOfTrainers(int noOfTrainers) {
		NoOfTrainers = noOfTrainers;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getHR() {
		return HR;
	}
	public void setHR(String hR) {
		HR = hR;
	}
	@Override
	public String toString() {
		return "Intitute [name=" + name + ", Owner=" + Owner + ", NoOfTrainers=" + NoOfTrainers + ", fees=" + fees
				+ ", HR=" + HR + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
} 
