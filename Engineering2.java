class Engineering2
{
	static String branchNames[]= new String[4];
    static int numberOfLabs[]=new int[4];
     static int numberOfStudents[]=new int[4];
    public static void main(String a[])
  {
          branchNames[0]="ME";
		  branchNames[1]="CIV";
		  branchNames[2]="EC";
		  branchNames[3]="CSE";
		  getBranchName();
		  numberOfLabs[0]=5;
		  numberOfLabs[1]=3;
		  numberOfLabs[2]=4;
		  numberOfLabs[3]=3;
		  getNumberOfLabs();
		  numberOfStudents[0]=86;
		  numberOfStudents[1]=34;
		  numberOfStudents[2]=45;
		  numberOfStudents[3]=42;
		  getNumberOfStudent();
		  
		  
  }
	   public static void getBranchName(){
	    for(int z=0; z < branchNames.length; z++){
			System.out.println(branchNames[z]);
		}
		} 
		public static void getNumberOfLabs(){
        for(int x=0; x < numberOfLabs.length; x++){
			System.out.println(numberOfLabs[x]);
		}
		}
		public static void getNumberOfStudent(){
		for(int c=0; c< numberOfStudents.length;c++){
			System.out.println(numberOfStudents[c]);
		}
  }
}