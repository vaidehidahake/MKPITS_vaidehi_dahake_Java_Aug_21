//ex-1 create an integer array of 5 elements to store 5 subject marks.
import java.util.*;
class ArrayExTest2
{
public static void main(String args[])
{
   int arr[]=new int[5];
   int total=0;
   float per;
   Scanner s=new Scanner(System.in);
   for(int i=0;i<5;i++)
   {
      System.out.println("enter five subject marks:");
      arr[i]=s.nextInt();
   }
    for(int i=0;i<arr.length;i++)
      {
         System.out.println("marks"+arr[i]);
        total=total+arr[i];
      }

      per=(float)(total/500.0f)*100.0f;
      System.out.println("totalmarks"+total);
      System.out.println("per"+per);
 }
}





