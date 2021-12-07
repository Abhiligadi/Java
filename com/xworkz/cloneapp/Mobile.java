package com.xworkz.cloneapp;

public class Mobile implements Cloneable{
    
	private String name;
	private String brand;
	private int prize;
	private int RAM;
	private int ROM;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getROM() {
		return ROM;
	}
	public void setROM(int rOM) {
		ROM = rOM;
	}
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", prize=" + prize + ", RAM=" + RAM + ", ROM=" + ROM + "]";
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("AAAAAAAAAAAAAAAAAAAA");
		return super.clone();
	}
}
