import java.util.*;
class Account
{
int accno;
String name;
int amount;

void insert(int a,String n,int am)
{
accno=a;
name=n;
amount=am;
}

void deposit(int amt)
{

   amount=amount+amt;
   System.out.println("after depositing the amount is="+amt);
}

void withdrawl(int amt)
{
if(amount<amt)
{
System.out.println("Insufficient amount="+amt);
}
else
{
amount=amount-amt;
 System.out.println("after withdrawing the amount is="+amt);
 }
 }

 void CheckBalance()
 {
    System.out.println("balance amount is="+amount);
 }
 void display()
 {
 System.out.println("account number is="+accno);
 System.out.println("name is="+name);
 System.out.println("amount is="+amount);
 }
}

class AccountTest
{
public static void main(String[] args)
{
Account a1=new Account();
Scanner scan=new Scanner(System.in);
System.out.println("enter account number:");
int accno=scan.nextInt();
System.out.println("enter name:");
String name=scan.next();
System.out.println("enter amount:");
int amount=scan.nextInt();

a1.insert(accno,name,amount);
a1.display();
System.out.println("enter Amount to be deposited in your account ");
int amt =scan.nextInt();
a1.deposit(amt);
a1.CheckBalance();

System.out.println("enter Amount to be withdrawl in your account ");
 amt =scan.nextInt();

a1.withdrawl(amt);
a1.CheckBalance();


    }
    }
