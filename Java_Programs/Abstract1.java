//ex1-abstract class
abstract class Account
{
  abstract void deposit();//method without body.
  void withdrawl()
  {
  System.out.println("withdrawl method");
  }
}

class Abstract1
{
public static void main(String args[])
{
  Account act=new Account();//error: Account is abstract; cannot be instantiated.
}
}
