//1) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception.
import java.io.IOException;
class Account
{
  void deposit(int amt)
  {
  System.out.println("deposit method of account class");
  }
}
class Saving extends Account
{
  void deposit(int amt)throws IOException                 //error: overridden method does not throw IOException.
    {
    System.out.println("deposit method of Saving class");
    }
 }

 class TestExHaOver1
 {
 public static void main(String args[])
 {
    Saving s1=new Saving();
    s1.deposit(100);
  }
}

