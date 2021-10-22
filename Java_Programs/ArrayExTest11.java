//ex-2 Returning Array from the Method.
import java.util.*;
class ArrayExTest11
{
static int[] marks()
{
  return new int[] {78,75,89};
}
public static void main(String args[])
{
  int m[]=marks();
  for(int val:m)
  {
  System.out.println("marks"+val);
  }
}
}