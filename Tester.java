package com.xowrks.ecomerce;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		 System.out.println("main method is created");
		 Scanner sc=new Scanner(System.in);
		 IApplication app=new AmazonImplimatation();
		 if(app !=null) {
			 
			 app.electronicDevice();
			 app.DressItems();
		 }
		 
		 IApplication app1=new FlipkartImpl();
		 if(app1 !=null) {
			 
			 app1.electronicDevice();
			 app1.DressItems();

	   }
	}
}
