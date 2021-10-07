class Engineer
{
   String name="vijji";
   public Engineer(){
  System.out.println(this.getClass().getSimpleName()+"object is created");
} 

   public void solvingTheProgram(String name)
   {
      System.out.println( "Engineer Solved Problem");
      System.out.println(name);   
}


}