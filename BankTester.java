class BankTester
{
    public static void main(String a[])
   {
     Bank loan = new BandhanBank();
	 loan.provideLoans(5.5);
	 System.out.println(loan);
	 
	 
	 Bank loan1 = new IciciBank();
     loan1.provideLoans(2.4);
     System.out.println(loan1);


     Bank loan2 = new SbiBank();
     loan2.provideLoans(3.6);
     System.out.println(loan2);
	 
	  Bank loan3 = new KvgBank();
     loan3.provideLoans(3.0);
     System.out.println(loan3);
	 }	
}