//ex-1 Addition of 2 Matrices in Java.
import java.util.*;
 class ArrayExTest27
{
  public static void main(String args[])
  {
	      int a[][]={{1,3,4},{3,4,5}};
	      int b[][]={{1,3,4},{3,4,5}};
	      int c[][]=new int[2][3];

	      for(int i=0;i<2;i++)
	      {
	      for(int j=0;j<3;j++)
	      {
	      c[i][j]=a[i][j]+b[i][j];
	      System.out.print(c[i][j]+" ");
	      }
	      System.out.println();
	      }

	      }
	      }
