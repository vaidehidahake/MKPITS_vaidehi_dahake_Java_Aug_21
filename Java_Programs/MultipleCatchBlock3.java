//Ex-3 Multi-catch block-try block contains two exceptions. But at a time only one exception occurs and its corresponding catch block is invoked.
class MultipleCatchBlock3
{
public static void main(String args[])
{
  try
  {
  int b[]=new int[4];
  b[4]=50/0;
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