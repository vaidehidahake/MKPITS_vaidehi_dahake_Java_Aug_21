//2)ex-2 Rule: If the superclass method does not declare an exception,
//subclass overridden method cannot declare the checked exception but can declare unchecked exception.
import java.io.*;
    class Parent
    {
      void msg()
      {
      System.out.println("parent");
      }
    }

    class TestExHaOver4 extends Parent
    {
      void msg()throws ArithmeticException
      {
        System.out.println("child");
      }
      public static void main(String args[])
      {
       Parent p=new TestExHaOver4();
       p.msg();
      }
    }
