class Bank
{

    int getRateOfInterest()
    {
    return 0;
    }

    }
    //Creating child classes.
    class SBI extends Bank
    {

int getRateOfInterest()
{

		return 8;
}
    }

    class ICICI extends Bank
    {
    int getRateOfInterest()
    {
    return 7;
    }
    }
    class AXIS extends Bank
    {
    int getRateOfInterest()
    {
    return 9;
    }
    }

    class TestBankP
    {
    public static void main(String args[])
    {
		Bank b=null;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter bank name");
		String bn=scan.next();
    if(bn.equals("SBI"))
    b=new SBI();
    else if(bn.equals("ICICI"))
    b=new ICICI();
    else if(bn.equals("AXIS"))
    b=new AXIS();

    System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());

    }
    }
