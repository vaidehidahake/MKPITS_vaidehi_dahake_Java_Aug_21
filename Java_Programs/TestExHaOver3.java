//2)ex-1 Rule: If the superclass method does not declare an exception, 
//subclass overridden method cannot declare the checked exception but can declare unchecked exception.
import java.io.*;
class Account
{
  void deposit(int amt)
  {
  System.out.println("deposit method of account class");
  }
}
class Saving extends Account
{
  void deposit(int amt)throws ArithmeticException                 
    {
    System.out.println("deposit method of Saving class");
    }
 }

 class TestExHaOver3
 {
 public static void main(String args[])
 {
    Saving s1=new Saving();
    s1.deposit(100);
  }
}
