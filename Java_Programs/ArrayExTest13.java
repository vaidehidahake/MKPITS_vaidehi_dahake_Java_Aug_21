//ex-4 Returning Array from the Method.
import java.util.*;
class ArrayExTest13
{
static int[] marks()
{
   int[] arr= {78,75,89,99,100};
   return arr;
}
public static void main(String args[])
{
  int m[]=marks();
  for(int val:m)
  {
  System.out.println("marks:"+val);
  }
}
}