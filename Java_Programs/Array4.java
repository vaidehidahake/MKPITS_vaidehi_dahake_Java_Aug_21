//A scenario where ArrayIndexOutOfBoundsException occurs.
import java.util.*;
public class Array4
{
  public static void main(String args[])
  {


    int arr[]=new int[5];
     int res=0;
  try
  {
	  int num[]=new int[3];
	 num[4]=70;
  }
  catch(Exception ee)
  {
    System.out.println(ee.toString());
  }
  finally
  {
  System.out.println(res);
  }
  System.out.println("bye");
}
}

