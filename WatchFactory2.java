class WatchFactory2
{
 static	String factoryNames[]=new String[4];
 static int[] factoryFounded=new int[4];
 static	int[] watchPrices=new int[4];
   public static void main(String a[])
	{
	    
		factoryNames[0]="Titan";
		factoryNames[1]="Timex";
		factoryNames[2]="Casio";
		factoryNames[3]="Fastrack";
		getFactoryNames();
		factoryFounded[0]=1984;
		factoryFounded[1]=1854;
		factoryFounded[2]=1946;
		factoryFounded[3]=1998;
		getFactoryFounded();
		watchPrices[0]=40000;
		watchPrices[1]=50000;
		watchPrices[2]=60000;
		watchPrices[3]=70000;
		getWatchPrices();
		
	}
	   public static void getFactoryNames(){
		for(int x=0; x <factoryNames.length; x++){
			System.out.println(factoryNames[x]);
		}
		}
	    public static void getFactoryFounded(){
		for(int c=0; c < factoryFounded.length; c++){
          System.out.println(factoryFounded[c]);
		}
			
		}
		public static void getWatchPrices(){
        for(int a=0; a< watchPrices.length ; a++)
		{
		System.out.println(watchPrices[a]);
		}
	}
}