//ex : 3 create a class account having field accountno , bal and  method deposit and withdrawl.
//create a subclass saving and override the deposit and withdrawl method.
class Account
{
  int accno;
  int bal=1000;
  void deposit(int amt)
  {
    System.out.println("deposit method of account class");
  }
  void withdrawl(int amt)
    {
      System.out.println("withdrawl method of account class");
  }
}

class Saving extends Account
{
    void deposit(int amt)
     {
       bal=bal+amt;
       System.out.println("amount deposited  in account class:"+bal);
     }
     void withdrawl(int amt)
       {
        bal=bal-amt;
         System.out.println("amount withdrawn from account class:"+bal);
       }
}

class TestAcct2
{
public static void main(String args[])
{
   //Account act=new Account();
   //act.accno=111;
   //act.deposit(200);
   //act.withdraw(50);

  Saving s=new Saving();
  s.accno=121;
  s.deposit(599);
  s.withdrawl(200);
  }
}