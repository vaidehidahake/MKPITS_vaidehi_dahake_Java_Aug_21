//ex-1.ArrayIndexOutOfBoundsException
import java.util.*;
class ArrayExTest14
{
static int[] get()
{
  return new int[] {78,75,89,99};
}
public static void main(String args[])
{
  int m[]=get();
  for(int i=0;i<5;i++)
  {
  System.out.println("value:"+m[i]);
  }
}
}