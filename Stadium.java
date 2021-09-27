class Stadium{
 public String name;
 public int seatAvailable;
 public String palce;
 public String owner;
 
   public Stadium(String Name,int SeatAvailable,String Palce,String Owner){
     System.out.println("Stadium object is created");
      name=Name;
	  seatAvailable=SeatAvailable;
	  palce=Palce;
	  owner=Owner;
	  System.out.println(name+"\n"+seatAvailable+"\n"+palce+"\n"+owner);
   }
      public static void main (String a[]){
	   Stadium ground= new Stadium("Chinnaswammi",50000,"Bengaluru","Government of karnatak"); 
	  }

}