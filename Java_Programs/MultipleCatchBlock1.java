//Ex-1 Multi-catch block
class MultipleCatchBlock1
{
public static void main(String args[])
{
  try
  {
  int b[]=new int[4];
  b[4]=50/0;
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