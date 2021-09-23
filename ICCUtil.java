class ICCUtil{
  
  public static void main (String a[]){
  
  ICC team = new ICC();
    team.teamName="India";
	team.teamCaptain="Rohit Sharma";
	team.players=15;
	team.mainBatsman="virat kohli";
	team.iccRank=1;
  
  System.out.println(team.teamName+"\n"+team.teamCaptain+"\n"+team.mainBatsman +"\n"+team.players+"\n" +team.iccRank);
     team.cricket();
	 
	 ICC team1 = new ICC();
    team1.teamName="Newzland";
	team1.teamCaptain="WILLIAMSON";
	team1.players=15;
	team1.mainBatsman="Tailer";
	team1.iccRank=3;
	 System.out.println(team1.teamName+"\n"+team1.teamCaptain+"\n"+team1.mainBatsman +"\n"+team1.players+"\n" +team1.iccRank);
     team1.cricket();
	 
	 
	 
	 
  }
}