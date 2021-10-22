//ex-2 Anonymous Array in Java.
import java.util.*;
class ArrayExTest9
{
  static void printArray(int arr[])
  {
  for(int i=0;i<arr.length;i++)
  {
    System.out.println(arr[i]);
  }
}

  public static void main(String args[])
  {
    printArray(new int[] {11,12,13,14});
  }
}