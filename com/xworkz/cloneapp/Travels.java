package com.xworkz.cloneapp;

public class Travels implements Cloneable{
   
	private String name;
	private String owner;
	private int NoOfBuses;
	private int StartedYear;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getNoOfBuses() {
		return NoOfBuses;
	}
	public void setNoOfBuses(int noOfBuses) {
		NoOfBuses = noOfBuses;
	}
	public int getStartedYear() {
		return StartedYear;
	}
	public void setStartedYear(int startedYear) {
		StartedYear = startedYear;
	}
	@Override
	public String toString() {
		return "Travels [name=" + name + ", owner=" + owner + ", NoOfBuses=" + NoOfBuses + ", StartedYear="
				+ StartedYear + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
