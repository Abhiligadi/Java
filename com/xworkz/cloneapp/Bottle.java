package com.xworkz.cloneapp;

public class Bottle implements Cloneable {
   
	private String Name;
	private int Prize;
	private String color;
	private int lengthInCM;
	public String getName() {
		return  Name;
	}
	public void setName(String penName) {
		this. Name = penName;
	}
	public int getPrize() {
		return Prize;
	}
	public void setPrize(int prize) {
		Prize = prize;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getLengthInCM() {
		return lengthInCM;
	}
	public void setLengthInCM(int lengthInCM) {
		this.lengthInCM = lengthInCM;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		 System.out.println("**************");
		return super.clone();
	}
	@Override
	public String toString() {
		return "Bottle [Name=" +  Name + ", Prize=" + Prize + ", color=" + color + ", lengthInCM=" + lengthInCM
				+ "]";
	}
	
}
