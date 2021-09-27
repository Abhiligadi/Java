class City{
    public String cityName;
	public int population;
	public int pinCode;
	public String touristPlace;

   public City(String name,int Population,int code,String place){
       System.out.println("City object is created");
	   cityName=name;
	   population=Population;
	   pinCode=code;
	   touristPlace=place;
   }
 
	public void cityDetails(){
	  System.out.println("collection of information");
	
	}
	  public void displayDetails(){
	   System.out.println(cityName+"\n"+population+"\n"+pinCode+"\n"+touristPlace);
	  }
	  
}