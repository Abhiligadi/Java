package com.xworkz.cloneapp;

public class Pen implements Cloneable{

	private String penName;
	private int Prize;
	private String color;
	private int lengthInCM;
	public String getPenName() {
		return penName;
	}
	public void setPenName(String penName) {
		this.penName = penName;
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
		 System.out.println("inhoke Cloneable");
		return super.clone();
	}
	@Override
	public String toString() {
		return "Pen [penName=" + penName + ", Prize=" + Prize + ", color=" + color + ", lengthInCM=" + lengthInCM
				+ "]";
	}
	
}
