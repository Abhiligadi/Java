import java.util.Scanner;
 class HospitalDTOTester
 {
  public static void main (String args[])
   {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");	
	int size=sc.nextInt();
	
    HospitalDTO hospital =new HospitalDTO(size);
    for(int i=0;i<size;i++){
    PatientDTO dto1 = new PatientDTO();
	System.out.println("Enter the patient details");
	
	System.out.println("Enter the Patient Id");
	int patientId=sc.nextInt();
	dto1.setPatientId(patientId);
	
	System.out.println("Enter the patient name");
	String name=sc.next();
	dto1.setName(name);
	
	System.out.println("Enter the patient Gender");
	String gender=sc.next();
	dto1.setGender(gender);
	
	System.out.println("Enter the patient Isalive");
	boolean alive=sc.nextBoolean();
	dto1.setAlive(alive);
    
	boolean isAdded=hospital.createPatient(dto1);
    System.out.println(isAdded);
 	}
	System.out.println("enter a name to search");
   String name1=sc.next();
   System.out.println(hospital.getPatientByName(name1));
   
   System.out.println("enter a Id to search");
   int patientId =sc.nextInt();

    System.out.println("enter the patient Gender to fetch details:");
   String gen=sc.next();
    System.out.println(hospital.getPatientByGender(gen));

	}
	
   
 }