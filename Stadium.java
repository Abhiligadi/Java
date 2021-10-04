class Stadium{
 public String name;
 public int seatAvailable;
 public String palce;
 public String owner;
 
   public Stadium(String nm,int sAvailable,String location,String ownr){
     System.out.println("Stadium object is created");
          name=nm;
	  seatAvailable=sAvailable;
	  palce=location;
	  owner=ownr;
	  System.out.println(name+"\n"+seatAvailable+"\n"+palce+"\n"+owner);
   }
      public static void main (String a[]){
	   Stadium ground= new Stadium("Chinnaswammi",50000,"Bengaluru","Government of karnatak"); 
	  }

}
