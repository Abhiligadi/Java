class IPL{
    static String teamsName[]=new String[5];
    static int tropyWinner[]=new int[5];
    public static void main(String a[])
	{
	   teamsName[0]="RCB";
	   teamsName[1]="MI";
	   teamsName[2]="SRH";
	   teamsName[3]="RR";
       teamsName[4]="KKR";
       getTeamsName();
	   tropyWinner[0]=0;
	   tropyWinner[1]=4;
	   tropyWinner[2]=1;
	   tropyWinner[3]=1;
	   tropyWinner[4]=2;
	   getTropyWinner();
	}
     public static void getTeamsName(){
	 for(int i=0;i < teamsName.length; i++){
	    System.out.println(teamsName[i]);
	   }
    }
public static void getTropyWinner(){
	for(int x=0;x < tropyWinner.length;x++){
		System.out.println(tropyWinner[x]);
	}
  }	
}