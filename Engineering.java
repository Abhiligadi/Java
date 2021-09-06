class Engineering
{
       static String[] branchNames=new String[4];
	   static int[] numberOfStudents=new int[4];
	   static byte[] numberOfLabs=new byte[4];
   public static void main(String a[])
  { 
    branchNames[0]="ME";
    branchNames[1]="CIV";
	branchNames[2]="EC";
	branchNames[3]="CSE";
	getBranchNames();
    numberOfLabs[0]=5; 
	numberOfLabs[1]=3;
	numberOfLabs[2]=4;
	numberOfLabs[3]=3;
	getNumberOfLabs();
	numberOfStudents[0]=68;
	numberOfStudents[1]=80;
	numberOfStudents[2]=46;
	numberOfStudents[3]=30;
	getNumberOfStudents();
  }
     public static void getBranchNames(){
	     for(int z=0; z < branchNames.length; z++){
			System.out.println(branchNames[z]);
		} 
	 }
	 public static void getNumberOfLabs(){
        for(int x=0; x < numberOfLabs.length; x++){
			System.out.println(numberOfLabs[x]);
		}
	 }
	 public static  void getNumberOfStudents(){
		for(int c=0; c< numberOfStudents.length;c++){
			System.out.println(numberOfStudents[c]);
		}
	 }
	  
}