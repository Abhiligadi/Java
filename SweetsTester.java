class SweetsTester{

public static void main(String a[]){
     
	   Sweets sweets = new Sweets();
		sweets.sweetsName="Dharwad peda";
	   sweets.price=400;
	   sweets.place="Dharwad";
	   sweets.dietType="vegetarian";
	  System.out.println(sweets.sweetsName+"\n"+sweets.price+"\n"+sweets.place+"\n"+sweets.dietType);
         sweets.Eat();
		 
		  Sweets sweets1 = new Sweets();
		sweets1.sweetsName="Mysur pak";
	   sweets1.price=800;
	   sweets1.place="india";
	   sweets1.dietType="vegetarian";
	  System.out.println(sweets1.sweetsName+"\n"+sweets1.price+"\n"+sweets1.place+"\n"+sweets1.dietType);
         sweets1.Eat();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}