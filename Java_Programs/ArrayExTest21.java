//ex-1 the class name of Java array.
import java.util.*;
 class ArrayExTest21
{
  public static void main(String args[])
  {
	  int[] arr={11,12,13,14};
	  Class c=arr.getClass();
	  String name=c.getName();
	  System.out.println(name);
  }
}