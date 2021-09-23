class FilmIndustryTester{
public static void main(String a[]){
     FilmIndustry industry = new FilmIndustry();
	 industry.industryName="Bollywood";
	 industry.place="india";
	 industry.language="Hindi";
	 industry.bestFilm="PK";
	 industry.worldRank=2;
	  System.out.println(industry.industryName+"\n"+industry.place+"\n"+ industry.language +"\n"+industry.bestFilm+"\n" +industry.worldRank);
        industry.seen();
		FilmIndustry industry1 = new FilmIndustry();
	 industry1.industryName="sandlewood";
	 industry1.place="india";
	 industry1.language="kannada";
	 industry1.bestFilm="KGF";
	 industry.worldRank=5;
	  System.out.println(industry1.industryName+"\n"+industry1.place+"\n"+ industry1.language +"\n"+industry1.bestFilm+"\n" +industrys.worldRank);
        industry1.seen();
	 }
}