class EngineerUtil
{
   public static void main(String a[])
   {
	   MechEngineer mech = new MechEngineer();
       mech.name="Abhishek";
	   mech.companyName="IBM";
	   mech.salary=60000;
	   mech.gender="Male";
	   String detail=mech.solvingTheProblems();
       System.out.println(detail);
       mech.display();	   
    
	
	EcEngineer ec = new EcEngineer();
       ec.name="Shreenidhi";
	   ec.companyName="IBM";
	   ec.salary=60000;
	   ec.gender="Female";
	   String detai=ec.solvingTheProblems();
       System.out.println(detai);
       ec.display();
	   
	   CivilEngineer civ = new CivilEngineer();
       civ.name="Nandish";
	   civ.companyName="Tcs";
	   civ.salary=60000;
	  civ.gender="Male";
	   String deta=civ.solvingTheProblems();
       System.out.println(deta);
       civ.display();
	   
	   CsEngineer cs = new CsEngineer();
       cs.name="preetam";
	   cs.companyName="HP";
	   cs.salary=60000;
	   cs.gender="Male";
	   String det=cs.solvingTheProblems();
       System.out.println(det);
       cs.display();
	   
	   
	}

}