class PatientDTOUtil{

  public static void main (String a[]){
  
  PatientDTO dth = new PatientDTO();
    dth.setPatientId(7777777L);
    dth.setPatientName("Chetan");	
    dth.setAge(22);
	dth.setGender("male");
	dth.setBloodGroup("B+");
	
	System.out.println( dth.getPatientId()+ "\n" + dth.getPatientName() + "\n" + dth.getAge() + "\n" +  dth.getGender() + "\n" + dth.getBloodGroup());
  }

}