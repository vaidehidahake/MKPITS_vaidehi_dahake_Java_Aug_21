//ex-1 Cloning an Array in Java.
import java.util.*;
 class ArrayExTest25
{
  public static void main(String args[])
  {
	  int[] arr={2,2,4,4,5,5};
	  System.out.println("printing original array:");
	  for(int i:arr)
	  {
	  System.out.println(i);
      }
      System.out.println("printing clone of an array:");
      int[] carr=arr.clone();
	  for(int i:carr)
	  {
	  System.out.println(i);
      }
      System.out.println("Are both equal?");
      System.out.println(arr==carr);
  }
}