 class AmazonPrime
 {
 static String movies[]={"Kgf","Robert","shershah","cindrell","pailwan"};
 static String series[]={"Ligth out","Mirzapur","The family man","Four more short","Mumbai Dairy"};
 
 static String movie="Dia";
 
 public static void main(String a[]){
 getMovies(movies);
 getMovies(movie);
 getSeries(series);
 
 }  
 
 public static void getMovies(String movies[]){
 System.out.println("inside getMoviesmethod with string array method");
 for(int i=0 ;i< movies.length ; i++){
 System.out.println(movies[i]);
    }
 }	
 public static String getMovies(String movie){
 System.out.println("inside getMovie method with string method");
 return movie;
    }   	
 public static void getSeries(String series[]){
 System.out.println("inside getMoviesmethod with string array method");
 for(int d=0 ; d<series.length ; d++){
 System.out.println(series[d]);
    }
  }	
}
