class GasCylinder{
  public String name;
  public int Wieght;
  public String color;
  public int price;
    public GasCylinder(String name,int wieght,String color,int price){
	System.out.println("GasCylinder object is created");
	this.name=name;
	Wieght=wieght;
	this.color=color;
	this.price=price;
	System.out.println(name+"\n"+Wieght+"\n"+color+"\n"+price);
	}
	public static void main(String a[]){
	 GasCylinder cylinder= new GasCylinder("Bharat",20,"Red",899);
	
	 GasCylinder cylinder1= new GasCylinder("India",20,"blue",850);
	}

}