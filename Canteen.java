class Canteen
{
  String canteenName;
  String adress;
  String owner;
  String[] items={"parota","Ragimudde","Rice palava", "Dosa"};
  int[] price={30,35,40,30};
  public Canteen()
  {
    this("manjunath" , "nearTOXworkz" ,"uncle");
	System.out.println("Canteen object is created");
    display();
  }
    public Canteen(String canteen,String adress,String owner)
   {
	 canteenName=canteen;
	 this.adress=adress;
	 this.owner=owner;
   }
   public void display()
   {
	 System.out.println(canteenName);
	 System.out.println(adress);
	 System.out.println(owner);
	 for(int i=0; i<items.length;i++)
	 {
	   System.out.println(items[i] + " : "+ price[i]);
	 }

   }
}