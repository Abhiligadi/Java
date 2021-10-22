class PatientDTO
{
  private int patientId;
  private String name;
  private String gender;
  private boolean alive;
  
  public PatientDTO()
  {
	System.out.println("PatientDTO object is created");
  }
  
  
  public int getPatientId()
  {
    return patientId;
  }
  public void setPatientId(int patientId)
  {
    this.patientId=patientId;
  }
  public String getName()
   {
     return name; 
   }
  public void setName(String name)
   {
     this.name=name;
   }
  public String getGender()
   {
     return gender;
   }
   public void setGender(String gender)
	{
	  this.gender=gender;
	}
   public boolean getAlive()
    { 
	  return alive;
    }	
   public void setAlive(boolean alive)
   {
     this.alive=alive;
   }
   @Override
   public String toString()
   {
	return "PatientDTO -> [Patient Id ="+this.patientId+",patient name = "+this.name+",Gender = "+this.gender+",Alive ="+this.alive+"]";
   }
}





 