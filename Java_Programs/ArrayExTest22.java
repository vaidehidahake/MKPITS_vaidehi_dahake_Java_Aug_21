//ex-2 the class name of Java array.
import java.util.*;
 class ArrayExTest22
{
  public static void main(String args[])
  {
	  int[] arr={2,2,4,4,5,5};
	  Class c=arr.getClass();
	  String name=c.getName();
	  System.out.println(name);
  }
}