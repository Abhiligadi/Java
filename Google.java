class Google{

     public String appName;
	 public String category;
	 public int sizeInGb;
	 public String purpose;
	 
	 public Google(String name,String Category,int siz,String use){
	    appName=name;
		category=Category;
		sizeInGb = siz;
		purpose=use;
		System.out.println("Google object is created");	
	 }
    public void appInformation(){
	   System.out.println("Sharing the information");
	  }
    public void displayAppDeatails()
	       {
	        System.out.println(appName+"\n"+category+"\n"+sizeInGb+"\n"+purpose);
			}

}