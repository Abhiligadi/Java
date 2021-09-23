class MusicallnstrumentUtil{

   Musicallnstrument music = new Musicallnstrument();
   
   public static void main (String a[]){
	  Musicallnstrument music = new Musicallnstrument();
      music.name="Guitar";
	  music.price=500;
	  music.frequency="20Hz";
	  music.type="western";
	  
	  System.out.println(music.name+"\n"+music.price+"\n"+music.frequency+"\n"+music.type);
      music.play(music.name); 
   }
}