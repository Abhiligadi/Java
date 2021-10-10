class Rubiks
{
  String shape;
  int sides;
  String[] colors={"Yellow","White","red","Green","blue","orange"};
    
  public Rubiks()
  {
	this("cube",6);
    System.out.println(" ");
  }
   public Rubiks(String shape,int side)
   {
	this.shape=shape;
	sides=side;
	   
   }
    public void display()
	{
	  System.out.println(shape);
	  System.out.println(sides);
	 
	
	for(int i=0;i<colors.length;i++)
	{
	  System.out.println(colors[i]);
	}
	}
	
}