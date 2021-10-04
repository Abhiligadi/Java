class Museum{
   
    String museumName;
	String place;
    int contructed;
     String owner;
     String CEO;
	 boolean beautifull;
    String collections[]={"toy cart","bull","pasupati seal","dancing girl"};	

   public Museum(){
     this("National museum" , "New delhi" ,1949, "Governament of india" , "Shri Raghavendra singh" ,true );
	 System.out.println("Museum object is created");
   }
     public Museum(String museumName ,String place , int contructed , String owner , String CEO ,  boolean beautifull){
	   this.museumName=museumName;
	  this.place=place;
	  this.contructed=contructed;
	  this.owner=owner;
	  this.CEO=CEO;
	  this.beautifull=beautifull;
	 }
   
   public void dispalyDetails(){
      
	  System.out.println(this.museumName + "\n" + this.place + "\n" + this.contructed + "\n" + this.owner + "\n" + this.CEO + "\n" + this.beautifull);
   
   }
   public void getCollections(){
   for(int i=0;i<this.collections.length;i++)
   {
     System.out.println(this.collections[i]);
   }
 }
   
}