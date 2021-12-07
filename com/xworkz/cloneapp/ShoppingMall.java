package com.xworkz.cloneapp;

public class ShoppingMall implements Cloneable{

	private  String name;
	private int NoOfFloors;
	private String location;
	private int NoOfShops;
	private boolean isOpen;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfFloors() {
		return NoOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		NoOfFloors = noOfFloors;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfShops() {
		return NoOfShops;
	}
	public void setNoOfShops(int noOfShops) {
		NoOfShops = noOfShops;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setIsOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("*********************");
		return super.clone();
	}
	@Override
	public String toString() {
		return "ShoppingMall [name=" + name + ", NoOfFloors=" + NoOfFloors + ", location=" + location + ", NoOfShops="
				+ NoOfShops + ", isOpen=" + isOpen + "]";
	}
	
}
