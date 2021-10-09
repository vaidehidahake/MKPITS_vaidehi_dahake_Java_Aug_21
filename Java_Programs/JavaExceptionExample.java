//A scenario where ArithmeticException occurs.
public class JavaExceptionExample
{
      public static void main(String args[])
      {
       try
       {

          int data=100/0;//java.lang.ArithmeticException:/ by zero.
       }
       catch(ArithmeticException e)
       {
       System.out.println(e);
       }

       System.out.println("rest of the code...");
      }
    }

