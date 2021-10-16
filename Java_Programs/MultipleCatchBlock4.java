////Ex-4 Multi-catch block
class MultipleCatchBlock4

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
    int b1[]=new int[4];
    try
    {
     b1[4]=50;
    }



  catch(ArrayIndexOutOfBoundsException e1)
  {
    System.out.println("ArrayIndexOutOfBoundsException occurs..");
  }
}


  System.out.println("rest of the code");
}

}