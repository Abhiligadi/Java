class WatchFactory
{
   public static void main(String a[])
	{
	    String[] factorynames={"Titan","Timex","Casio","Fastrack"};
		int[] factoryFounded={1984,1854,1946,1998};
		int[] watchPrices={40000,50000,60000,7000};
       for(int z=0; z < factorynames.lenght; z++){
		   System.out.println(factorynames[z]);
	   }		
	   for(int x=0; x < factoryFounded.lenght; x++){
		   System.out.println(factoryFounded[x]);
	   }
	   for(int c=0; c < watchPrices.lenght; c++){
		   System.out.println(watchPrices[c]);
	   }
	}
}