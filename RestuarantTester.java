class RestuarantTester{
  
   public static void main(String a[]){
     Restuarant rest=new Restuarant();
	   rest.restuarentId=231;
       rest.restuarantName="1947";
	   rest.type="veg";
	   rest.location="Rajajinagara";
       rest.ownerName="Sadananda gowda";
	   
	    rest.display();
	   
   Restuarant rest1 =new Restuarant();
	   rest1.restuarentId=289;
       rest1.restuarantName="tiger";
	   rest1.type="Non-veg";
	   rest1.location="rajakumar circle";
       rest1.ownerName="punit";
    rest.display();
   
    Restuarant rest2=new Restuarant();
	   rest2.restuarentId=420;
       rest2.restuarantName="sagar";
	   rest2.type="veg";
	   rest2.location="jdwsd";
       rest2.ownerName="somesh";
    rest.display();
   
   
   
   
   
   }


}