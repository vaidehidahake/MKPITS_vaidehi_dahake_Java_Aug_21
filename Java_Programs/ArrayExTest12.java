//ex-3 Returning Array from the Method.
import java.util.*;
class ArrayExTest12
{
static int[] get()
{
  return new int[] {78,75,89,99,100};
}
public static void main(String args[])
{
  int m[]=get();
  for(int i=0;i<m.length;i++)
  {
  System.out.println("value:"+m[i]);
  }
}
}