class ExamUtil
{
   static String[] hallTicket={"Ramdev Baba","PA2006AY001","Home Product"};
   
   public static void main(String a[])
   {
    boolean allow = Exam.allow(hallTicket);
	System.out.println(allow);
	}
   
 }