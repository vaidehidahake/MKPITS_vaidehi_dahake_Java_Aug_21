//Ex-2 Multi-catch block
class MultipleCatchBlock2
{
public static void main(String args[])
{
  try
  {
  int b[]=new int[4];
  System.out.println(b[5]);
  }

  catch(ArithmeticException e)
  {
    System.out.println("Arithmetic Exception occurs..");
  }

  catch(ArrayIndexOutOfBoundsException e)
  {
    System.out.println("ArrayIndexOutOfBoundsException occurs..");
  }

  catch(Exception e)
  {
    System.out.println("Parent Exception occurs..");
  }

  System.out.println("rest of the code");
}

}