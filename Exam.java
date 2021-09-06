class Exam{

public static String universityName="VTU";
public static String[] hallTicket={"Ramsdev Baba","PA2006AY001","Home Product"};
public static int fees=1350;
  
  public static boolean allow(String[] hallTicket)
  {
     boolean allowToExame=false;
       if(fees>1200)
	   {
	     if(hallTicket!=null)
	     {
	        allowToExame=true;
	        getHallTicket(hallTicket);
	        return allowToExame;
	   }
	   else{
	   System.out.println("No Hallticket!!!cannot allowToExame");
	       }
	   }
	   
	else{
	System.out.println("boss... please pay the fees");
	   }
	   return allowToExame;
  }
public static void getHallTicket(String[] hallTicket){
 for(int i=0;i<hallTicket.length;i++){
 
 System.out.println(hallTicket[i]);
 
    }
} 
}  