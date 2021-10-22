//ex-1 Returning Array from the Method.
import java.util.*;
class ArrayExTest10
{
  static int[] marks()
  {
    return new int[] {99,98,97,96};
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