class LaptopTester{

public static void main(String a[]){
     
	 Laptop laptop = new Laptop();
	  laptop.laptopId=46827;
	  laptop.name="HP";
	  laptop.series="15s";
	  laptop.price=42990;
	  laptop.color="Natural Silver";
	  System.out.println( laptop.laptopId+"\n"+  laptop.name+"\n"+ laptop.series +"\n"+ laptop.price +"\n"+ laptop.color+"\n");
         laptop.game();
	 


      Laptop laptop1 = new Laptop();    
	  laptop1.laptopId=465776;
	  laptop1.name="Dell";
	  laptop1.series="15s";
	  laptop1.price=40990;
	  laptop1.color="Black";
	  System.out.println( laptop1.laptopId+"\n"+  laptop1.name+"\n"+ laptop1.series +"\n"+ laptop1.price +"\n"+ laptop1.color+"\n");
         laptop1.game();

}
}
