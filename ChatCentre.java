class ChatCentre{
  String centreName;
  int centreId;
  String location;
  String ownerName;
  boolean isOpen;
  String items[]={"Pani puri","Kachor","Samosa","Pav Bhaji","Sandwich"};
   
    public ChatCentre()
	{this("Sai Chats", 2 , "near KLE ground" , "Hanuman" , true);
	System.out.println("ChatCenter object is created");
	
	}
   public ChatCentre(String centreName,int centreId,String location,String ownerName,boolean isOpen)                 //Contructor overloading.
   {         
   
   this.centreName=centreName;
   this.centreId=centreId;
   this.location=location;
   this.ownerName=ownerName;
   this.isOpen=isOpen;
   this.items=items;
   }
    
	 
	public void displayChatCentre(){
		
		System.out.println(this.centreName+"\n"+this.centreId+"\n"+this.location+"\n"+this.isOpen);
	}
   
   public void getitems(){
	   for(int i=0; i<this.items.length ; i++){
		System.out.println(this.items[i]);
	   }
	   
   }
}