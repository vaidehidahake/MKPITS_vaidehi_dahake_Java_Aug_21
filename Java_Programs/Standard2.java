//ex-3 exception handling.
class Standard2
{
  public static void main(String args[])
  {
  int n1=10;
  int n2=0;
  int res=0;
  try
  {
  res=n1/n2;
  }
  catch(Exception ee)
  {
  System.out.println(ee.toString());
  }
  finally
  {
  System.out.println("res="+res);
  }
  }
}


