package com.xworkz.cloneapp;

class Stadium implements Cloneable {
	private String  Name;
	private int NoOfSeat;
	private String location;
	private long contactNumber;
	private int startedYear;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNoOfSeat() {
		return NoOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		NoOfSeat = noOfSeat;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
		
		
	}
	public int getStartedYear() {
		return startedYear;
	}
	public void setStartedYear(int startedYear) {
		this.startedYear = startedYear;
	}
	@Override
	public String toString() {
		return "Stadium [Name=" + Name + ", NoOfSeat=" + NoOfSeat + ", location=" + location + ", contactNumber="
				+ contactNumber + ", startedYear=" + startedYear + "]";
	}
     
	 @Override
	public Object clone() throws CloneNotSupportedException {
		 System.out.println("**************");
		return super.clone();
	}
	
	
}
