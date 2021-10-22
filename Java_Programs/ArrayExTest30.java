//ex-2 Multiplication of 2 Matrices in Java.
import java.util.*;
 class ArrayExTest30
{
  public static void main(String args[])
  {
	      int a[][]={{4,4,4},{5,5,5},{6,6,6}};
	      int b[][]={{4,4,4},{5,5,5},{6,6,6}};
	      int c[][]=new int[3][3];

	      for(int i=0;i<3;i++)
	      {
	      for(int j=0;j<3;j++)
	      {
	      c[i][j]=0;
	      for(int k=0;k<3;k++)
	      {
	      c[i][j]=a[i][j]*b[i][j];
	      }
	      System.out.print(c[i][j]+" ");
	      }
	      System.out.println();
	      }


    }
 }
