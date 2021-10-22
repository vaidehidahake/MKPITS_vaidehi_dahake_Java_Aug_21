//ex-1 Passing Array to a Method in Java.
import java.util.*;
class ArrayExTest6
{
public static void main(String args[])
{
   int arr[]=new int[5];

   Scanner s=new Scanner(System.in);
   for(int i=0;i<5;i++)
   {
      System.out.println("enter five subject marks:");
      arr[i]=s.nextInt();
   }
   calculate(arr);
   }
   static void calculate(int marks[])
   {
	   int total=0;
	   float per;
    for(int i:marks)
      {
         System.out.println("marks"+i);
        total=total+i;
      }


      per=(float)(total/500.0f)*100.0f;
      System.out.println("totalmarks"+total);
      System.out.println("per"+per);
 }
}
