//ex-2 Cloning an Array in Java.
import java.util.*;
 class ArrayExTest26
{
  public static void main(String args[])
  {
	  int[] arr={11,12,13};
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