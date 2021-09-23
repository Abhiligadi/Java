class ChocolateTester{
public static void main(String a[]){
     
	  Chocolate chocolate= new Chocolate();
	   chocolate.chocolateName="kitkat";
	   chocolate.owner="Nestle";
	   chocolate.price=100;
	   chocolate.manufactureBy="india";
	  System.out.println(chocolate.chocolateName+"\n"+ chocolate.owner+"\n"+chocolate.price +"\n"+ chocolate.manufactureBy);
         chocolate.teaste();
		 
		 
		 	  Chocolate chocolate1= new Chocolate();
	   chocolate1.chocolateName="dairymilk";
	   chocolate1.owner="Nestle";
	   chocolate1.price=50;
	   chocolate1.manufactureBy="india";
	  System.out.println(chocolate1.chocolateName+"\n"+ chocolate1.owner+"\n"+chocolate1.price +"\n"+ chocolate1.manufactureBy);
         chocolate1.teaste();
	 }
}