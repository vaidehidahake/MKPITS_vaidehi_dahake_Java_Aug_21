//ex-1 Anonymous Array in Java.
import java.util.*;
class ArrayExTest8
{
      static void min(int arr[])
      {
      int min=arr[0];
      for(int i=1;i<arr.length;i++)
      {
       if(min>arr[i])
       {
        min=arr[i];

      System.out.println(min);
       }
      }
  }

      public static void main(String args[])
      {
     min(new int[] {33,3,4,5});

      }
      }
