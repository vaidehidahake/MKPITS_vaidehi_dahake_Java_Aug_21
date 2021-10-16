//Ex-6 Multi-catch block-Let's see an example, to handle the exception without maintaining the order of exceptions (i.e. from most specific to most general).
class MultipleCatchBlock6

{

public static void main(String args[])
{
  try
  {
  int b[]=new int[4];
  b[4]=50/0;

  }

  catch(Exception e)
    {
      System.out.println("common task completed");
  }

  catch(ArithmeticException e)
  {
    System.out.println("task1 completed");

    }



  catch(ArrayIndexOutOfBoundsException e)
  {
    System.out.println("task2 completed");
  }



  System.out.println("rest of the code");
}

}