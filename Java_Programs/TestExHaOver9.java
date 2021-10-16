//3)ex-5(subclass exception) Rule: If the superclass method declares an exception,
//subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
import java.io.*;
    class Parent
    {
      void msg()throws ArithmeticException
      {
      System.out.println("parent");
      }
    }

    class TestExHaOver9 extends Parent
    {
      void msg()throws Exception
      {
        System.out.println("child");// compile time error.
      }
      public static void main(String args[])
      {
		  Parent p=new TestExHaOver9();
              try
              {
	          p.msg();
	          }
	          catch(Exception e){}

      }
    }

