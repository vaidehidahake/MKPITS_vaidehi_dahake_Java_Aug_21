//assignment-create a parent class account having fields accountno and balance. and constructor with 2 parameters
//create a subclass saving inherited from account class having fields interest
//and constructor with 3 parameters and from this call parent class constructor.
//and a display method, deposit method and withdrawl method.
import java.util.*;
class Account
{
    int accountno;
    int balance;

    Account( int accountno,int balance)
    {
        this.accountno=accountno;
        this.balance=balance;
    }

    void displayAccountdata()
    {
    System.out.println("accountno="+accountno);
     System.out.println("balance="+balance);
    }

 }

 class Saving extends Account
 {
    int interest;

    Saving( int accountno,int balance,int interest )
        {
            super(accountno,balance);
            this.interest=interest;

        }

        void displaySavingdata()
        {
        System.out.println("accountno="+accountno);
        System.out.println("balance="+balance);
        System.out.println("interest="+interest);

        }

        void deposit(int amount)
        {
          balance=balance+amount+interest;
           System.out.println("Amount deposited Successfully"+balance);
         }

           void withdraw(int amount)
	         {
	         if(amount>balance)
	         {
	            System.out.println("Due to insufficient balance amount cannot be withdrawn");
	         }
	         else
	         {
	           balance=balance-amount;
	            System.out.println("Amount withdrawl Successfully"+amount);
                  }
			  }
         void showbalance()
         {
           System.out.println("balance in your account is:"+balance);
         }

         }

     class TestSuper9
 {
     public static void main(String args[])
     {
        Scanner scan =new Scanner(System.in);
        System.out.println("Saving detail of account are:");
        System.out.println("enter accountno:");
        int accountno=scan.nextInt();
         System.out.println("enter balance:");
        int balance=scan.nextInt();
         System.out.println("enter amount to be deposited:");
	     int amount=scan.nextInt();
	     System.out.println("enter interest:");
        int interest=scan.nextInt();
	  System.out.println("enter amount to be withdrawn:");
	   int amount1=scan.nextInt();

	Saving s1=new Saving(accountno,balance,interest);
	s1.deposit(amount);
	s1.showbalance();
	s1.withdraw(amount);
	s1.showbalance();
      }
}










