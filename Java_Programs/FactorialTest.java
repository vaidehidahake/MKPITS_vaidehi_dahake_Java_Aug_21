class Factorial
{
void fact(int n)
{
   int fact=1;
   while(n>0)
   {
   fact=fact*n;
   n--;
   }
   System.out.println("fact="+fact);
 }


public static void main(String[] args)
{
 new Factorial().fact(5);//calling method using anonymous object
 }

}