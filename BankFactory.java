package com.xworkz.sbiatm;

public class BankFactory {
    public static ICard getMoney(String type) {
    	if(type.equals("SbiCard")) {
    		return new SbiImplimentation();
    	}
    	else if(type.equals("IcciCard"))
    	{
    		return new  IcciImplimentation();
    	}
    	else 
    	{
    		  System.out.println("bank is not found");
    	}
    	return null;
    }
}
