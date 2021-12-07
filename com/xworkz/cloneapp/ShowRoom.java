package com.xworkz.cloneapp;

public class ShowRoom implements Cloneable{
   
	private String name;
	private String Owner;
	private int  StartedYear;
	private  String founder;
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
	public int getStartedYear() {
		return StartedYear;
	}
	public void setStartedYear(int startedYear) {
		StartedYear = startedYear;
	}
 
	@Override
	public String toString() {
		return "ShowRoom [name=" + name + ", Owner=" + Owner + ", StartedYear=" + StartedYear + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
