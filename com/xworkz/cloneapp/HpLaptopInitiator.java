package com.xworkz.cloneapp;

public class HpLaptopInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
		 HpLaptop hp =new HpLaptop();
		 hp.setName("LAPTOP-CQR8B6A1");
         hp.setPrize(43000);
         hp.setVersion("21H2");
         hp.setRAM(8);
         
         HpLaptop hp1=(HpLaptop)hp.clone();
         System.out.println(hp1);
	}

}
