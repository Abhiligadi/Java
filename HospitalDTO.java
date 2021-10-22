class HospitalDTO{

   public PatientDTO[] patients;
     private int index;
	 
       public HospitalDTO (int size)
	   {
		patients=new PatientDTO[size];
		   
	   }
   
   public boolean createPatient(PatientDTO patients){
    boolean patientAdded=false;
	System.out.println("Inside creatPatients method ");
   	
	if(patients != null)
	{
	   this.patients[index++]=patients;
	   patientAdded=true;
	}
   else
   {
	 System.out.println("no patient added");
	 return patientAdded=true;
   }
     
	 return patientAdded;

   }
public void getAllPatient()
{
  for (int i=0;i<patients.length;i++)
  {
	System.out.println(patients[i]); 
  }
	
}
public PatientDTO getPatientByName(String name)
{
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientByName()");
	 if( name !=null)
	 {
		for (int i=0;i<patients.length;i++)
		{ 
          if(patients[i].getName().equals(name)){
			System.out.println("Patient found by name;"+name);		
			patientDTO=patients[i];
			}
	}
}
return patientDTO;
}

public PatientDTO getPatientById(int patientId)
{
	PatientDTO patientDTO=null;
	System.out.println("inside getPatientById()");
	 if(patientId!=0)
	 {
		for (int i=0;i<patients.length;i++)
		{ 
          if(patients[i].getPatientId()==patientId){
			System.out.println("Patient found by id;"+patientId);		
			patientDTO=patients[i];
			}
	}
}
return patientDTO;
}

     public PatientDTO getPatientByGender(String gender){
PatientDTO patientDTO=null;
System.out.println("Inside the getPatientByGender()");

 if(gender!=null){

  for(int i=0;i<patients.length;i++){

    if(patients[i].getGender().equals(gender)){
      System.out.println("Patient found by Gender: "+gender);
      patientDTO=patients[i];
     }
   }
 }
 return patientDTO;
}
}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
    