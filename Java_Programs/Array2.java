//A scenario where NullPointerException occurs.
import java.util.*;
public class Array2
{
  public static void main(String args[])
  {


    int arr[]=new int[5];
    int res=0;
  try
  {
	  String s=null;
	  System.out.println(s.length());//NullPointerException occurs.
  }
  catch(Exception ee)
  {
    System.out.println(ee.toString());
  }
  finally
  {
  System.out.println("finally executed");
  }
  System.out.println("bye");
  System.out.println("program reached successfully till end");
}
}

