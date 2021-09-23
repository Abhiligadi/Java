class ModulusTwoNumber
{
public static void main(String a[])
 {
  modulus(49,30);    //arguments
  modulus(25,20); 
  modulus(56,40);     //caller method
  modulus(84,65);
 }
  public static void modulus(int s,int d)   //signature of the method//called method
  {
  System.out.println(s % d);
  }
}