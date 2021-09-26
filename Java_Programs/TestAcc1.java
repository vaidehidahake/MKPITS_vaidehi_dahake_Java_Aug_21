//3-Hierarchical Inheritance Example.
class Account
{
	int acctno;
	int balance;
	void insertAccountdata(int acctno,int balance)
	{
		this.acctno=acctno;
		this.balance=balance;
	}
	void Showbalance()
	{
		System.out.println("balance for accuntno  " + acctno + " is "  + balance);
	}
	}

class Saving extends Account
{
	void Deposit(int amount)
	{
		int interest=500;
		balance=balance + amount + interest;
		System.out.println("amount deposited successfully in saving account");
	}
}
class Current extends Account
{
	void Deposit(int amount)
	{

		balance=balance + amount ;
		System.out.println("amount deposited successfully in current account");
	}
}

class TestAcc1
{
	public static void main(String[] arg)
	{
		Saving s=new Saving();
		s.insertAccountdata(156,1000);
		s.Deposit(200);
		s.Showbalance();

		Current c=new Current();
				c.insertAccountdata(223,10000);
				c.Deposit(1000);
		c.Showbalance();

	}
}
