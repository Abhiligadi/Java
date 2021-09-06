class Temple
{
	static String[] templeNames = new String[3];
    public static void main(String a[])
	{
     templeNames[0]="Hanuman";
	 templeNames[1]="ganesh";
	 templeNames[2]="laxmi";
	 getTempleNames();
    }
public static void getTempleNames()
    {
  for (int x=0; x < templeNames.length; x++){
	  System.out.println(templeNames[x]);
	  
        }
	}
}