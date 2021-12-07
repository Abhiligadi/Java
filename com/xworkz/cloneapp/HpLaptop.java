package com.xworkz.cloneapp;

public class HpLaptop implements Cloneable{
	private String name;
	private int prize;
	private String version;
	private int RAM;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}	
	@Override
	public  Object clone() throws CloneNotSupportedException {
	 System.err.println("************");
		return super.clone();
	}
	@Override
	public String toString() {
		return "HpLaptop [name=" + name + ", prize=" + prize + ", version=" + version + ", RAM=" + RAM + "]";
	}
}
