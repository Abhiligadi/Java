class Parliament{
    public String partyName;
	public String headName;
	public int members;
	public String place;

   public Parliament(String name,String Head,int member,String places){
       System.out.println("City object is created");
	   partyName=name;
	   headName = Head;
	   members=member;
	   place=places;
	  
   }
 
	public void partyDetails(){
	  System.out.println("collection of information");
	
	}
	  public void displayDetails(){
	   System.out.println(partyName+"\n"+ headName + "\n"+members+"\n"+place);
	  }
	  
}