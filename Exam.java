class Exam
{
   public String universityName;
   public int fees;
   
   public Exam(String universityName,int fees)
   {
      System.out.println("Exam object created");
	this.universityName=universityName;
	this.fees=fees;
	  System.out.println(universityName+"\n"+fees);
   }
  
  public static void main(String a[])
    {
     Exam  exam=new Exam("VTU",1350);
    }
}