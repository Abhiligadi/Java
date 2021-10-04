class Metro{

    String metroLine;
	String place;
	String owner;
	float length;
	String startingPoint;
	String endPoint;
	int numberOfStation;
    String stations[] ={"Sampige Road","Yeshwanthpura","Peenya Industry","National College","mahakavi Kuvenpu"};

   public Metro()
   {
     this("Green", "Bengaluru","BMRCL",24.2f,"Nagasandra","yeachenahalli",24);
     System.out.println("Metro object is created");
   }
    
	public Metro(String metroLine,String place,String owner,float length,String startingPoint,String endPoint,int numberOfStation){
		this.metroLine=metroLine;
		this.place=place;
		this.owner=owner;
		this.length=length;
		this.startingPoint=startingPoint;
		this.endPoint=endPoint;
		this.numberOfStation=numberOfStation;
	}
	public void displayMetroDetails()
	{
	System.out.println(this.metroLine+"\n"+this.place+"\n"+this.owner+"\n"+this.length+"\n"+this.startingPoint+"\n"+this.endPoint+"\n"+this.numberOfStation);
	}
  public void getStations(){
	  for(int i=0;i<this.stations.length;i++)
	  {
		  System.out.println(this.stations[i]);
	  }
	 
	  
  } 
}