class account {
	int acctno;
	int balance;
	void insertaccountdata(int acctno,int balance)
	{
		this.acctno=acctno;
		this.balance=balance;
	}
	void showbalance()
	{
		System.out.println("balance for accuntno  " + acctno + " is "  + balance);
	}
	}

class saving extends account {
	void deposit(int amount)
	{
		int interest=500;
		balance=balance + amount + interest;
		System.out.println("amount deposited successfully in saving account");
	}
}
class current extends account {
	void deposit(int amount)
	{

		balance=balance + amount ;
		System.out.println("amount deposited successfully in current account");
	}
}


class testaccount3
{
	public static void main(String[] arg)
	{
		saving s=new saving();
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter details for saving account ");
		System.out.println("enter account no");
		int acctno=scan.nextInt();
		System.out.println("enter balance");
		int balance=scan.nextInt();

		s.insertaccountdata(acctno,balance);
		System.out.println("enter amount to deposit");
				int amount=scan.nextInt();

		s.deposit(amount);
		s.showbalance();

		current c=new current();
		System.out.println("enter details for current account ");
				System.out.println("enter account no");
				 acctno=scan.nextInt();
				System.out.println("enter balance");
		 balance=scan.nextInt();
				c.insertaccountdata(acctno,balance);
					System.out.println("enter amount to deposit");
				amount=scan.nextInt();
				c.deposit(amount);
		c.showbalance();

	}
}
