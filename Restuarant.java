class Restuarant
{
	public int restuarentId;
	public String restuarantName;
	public String type;
	public String location;
	public String ownerName;

  public Restuarant()
      {
	  System.out.println("restuarant object is created");
	  } 
 
  public void serveFood()
     {
	  System.out.println("serving food with delisious item");
     }
     public void display()
	 {
	  System.out.println(restuarentId+"\n"+restuarantName+"\n"+type+"\n"+location+"\n"+ownerName);
	 }
 }