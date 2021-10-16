//3)ex-4(subclass exception) Rule: If the superclass method declares an exception,
//subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.

import java.io.*;
class Account
{
  void deposit(int amt)throws IOException
  {
  System.out.println("deposit method of account class");
  }
}
class Saving extends Account
{
  void deposit(int amt)throws Exception //compile time error.
    {
    System.out.println("deposit method of Saving class");
    }
 }

 class TestExHaOver8
 {
 public static void main(String args[])
 {
 try
 {
    Saving s1=new Saving();
    s1.deposit(100);
  }
  catch(Exception ee)
  {
    System.out.println(ee.toString());
  }
  }
}
