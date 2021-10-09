import java.util.*;
public class Array1
{
  public static void main(String args[])
  {


    int arr[]=new int[5];
    int res=0;
  try
  {
	  arr[6]=55;
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

