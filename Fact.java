class Fact{
public static void main(String a[])
{
myfactorial(3);
} 
public static void myfactorial(int num){
int fact=1; 
for(int i=1;i <=num;i++){
fact=fact*i;
      }
System.out.println(fact);
   } 
}