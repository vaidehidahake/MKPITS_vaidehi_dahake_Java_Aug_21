//ex2-abstract class
abstract class Account
{
  abstract void deposit();//method without body.
    void withdrawl()
    {
     System.out.println("withdrawl method");
  }

}

class Saving extends Account
{
   void deposit()
   {
   System.out.println("deposit method");
   }

}

class Abstract2
{
public static void main(String args[])
{
  //Account act=new Account();//error: Account is abstract; cannot be instantiated.
  Account act=null;
  act=new Saving();
  act.deposit();

}
}
