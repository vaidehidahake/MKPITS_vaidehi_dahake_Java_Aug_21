//ex2 rule1
    import java.io.*;
    class Parent
    {
      void msg()
      {
      System.out.println("parent");
      }
    }

    class TestExHaOver2 extends Parent
    {
      void msg()throws IOException
      {
        System.out.println("TestExHaOver2");//error: overridden method does not throw IOException.
      }
      public static void main(String args[])
      {
       Parent p=new TestExHaOver2();
       p.msg();
      }
    }
