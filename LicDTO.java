public class LicDTO{
   public LicDTO(){
   System.out.println("LicDTO is created");
   }
     private long policyId;
	 private String customerName;
	 private int year;

      public long getPolicyId(){
	  return policyId;
	  }
      public void setPolicyId(long policyId)
     {
	    this.policyId=policyId;
	 }
      public String getCustomerName()
	  {
	     return customerName;
	  }
      public void setCustomerName(String customerName)
	  {
	     this.customerName=customerName;
	  }
       public int getYear()
	   {
	      return year;
	   }
        public void setYear(int year)
      {
	     this.year=year;  
	  }
}