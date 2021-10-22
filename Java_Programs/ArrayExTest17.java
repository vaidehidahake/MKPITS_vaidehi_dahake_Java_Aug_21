//ex-1 to instantiate Multidimensional Array in Java.
import java.util.*;
 class ArrayExTest17
{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      int[][] arr=new int[3][3];
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
           System.out.println("enter number:");
           arr[i][j]=scan.nextInt();
        }
      }

      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
           System.out.println(""+arr[i][j]);

          }
          System.out.println();
      }
     }
  }
