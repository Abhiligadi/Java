package com.xworkz.sbiatm;

import java.util.Scanner;

public class BankTester {

	public static void main(String[] args) {
		 System.out.println("main method is created");
		 Scanner sc=new Scanner(System.in);
		 //ICard iCard=BankFactory.getMoney(sc.next());
		// if(iCard !=null) {
		 ICard iCard =new SbiImplimentation();
		 if(iCard !=null) {
			 iCard.swapCard();
			 iCard.insertCard();
		 }
		 ICard iCard1 =new IcciImplimentation();
		 if(iCard1 !=null) {
			 iCard1.swapCard();
			 iCard1.insertCard();
		 }

	}

}
