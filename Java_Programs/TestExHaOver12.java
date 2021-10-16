//Example in case subclass overridden method declares no exception.
import java.io.*;  
    class Parent
    {  
      void msg()throws Exception
      {
      System.out.println("parent");
      }  
    }  
      
    class TestExHaOver12 extends Parent
    {  
      void msg()
      {
      System.out.println("child");
      }  
      
      public static void main(String args[])
      {  
       Parent p=new TestExHaOver12();  
       try
       {  
       p.msg();  
       }
       catch(Exception e){}  
      }  
    }  