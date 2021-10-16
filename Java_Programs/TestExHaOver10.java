//3)ex-2(same) Rule: If the superclass method declares an exception,
//subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.

import java.io.*;
    class Parent
    {
      void msg()throws Exception
      {
      System.out.println("parent");
      }
    }

    class TestExHaOver10 extends Parent
    {
      void msg()throws Exception
      {
        System.out.println("child");
      }
      public static void main(String args[])
      {
		  Parent p=new TestExHaOver10();
              try
              {
	          p.msg();
	          }
	          catch(Exception e)
	          {
				  }

      }
    }

