class SbiBank extends Bank
{
  public static void provideLoans(double roi)
  {
    System.out.println("loan given by SbiBank");
	System.out.println(roi);
  }
}