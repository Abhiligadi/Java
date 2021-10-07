class MNCUtil
{
   public static void main(String a[])
   {Accenture it = new Accenture();
     it.companyRank=1;
     it.managingDirector="Julie sweet";	 
     it.employees=624000;
     it.place="Ireland";
     String It1=it.details();
     System.out.println(It1);
     it.display();	
	 
	 
	 
	 
     IBM ibm = new IBM();
     ibm.companyRank=2;
     ibm.managingDirector="Snadip patel";	 
     ibm.employees=140000;
     ibm.place="Bengaluru";
     String It=ibm.details();
     System.out.println(It);
     ibm.display();	 
	 
	 Wifro it2 = new Wifro();
     it2.companyRank=9;
     it2.managingDirector="Premji";	 
     it2.employees=209890;
     it2.place="Bengaluru";
     String It2=it2.details();
     System.out.println(It2);
     it2.display();	 
   }
}