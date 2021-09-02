class Engineering2
{
   public static void main(String a[])
  {
       String branchNames[]= new String[4];
	      branchNames[0]="ME";
		  branchNames[1]="CIV";
		  branchNames[2]="EC";
		  branchNames[3]="CSE";
	   int numberOfLabs[]={5,3,4,3};
	   int numberOfStudents[]={80,60,45,30};
	    for(int z=0; z < branchNames.length; z++){
			System.out.println(branchNames[z]);
		} 
        for(int x=0; x < numberOfLabs.length; x++){
			System.out.println(numberOfLabs[x]);
		}
		for(int c=0; c< numberOfStudents.length;c++){
			System.out.println(numberOfStudents[c]);
		}
  }
}