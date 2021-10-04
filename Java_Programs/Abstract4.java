//Example-5 of Abstract class that has an abstract method.
import java.util.*;
abstract class Account
{
  int actno;
  float bal=2000;
   String str="";
abstract void deposit(float amt);
 abstract void withdrawl(float amt);

String showbalance()
{
  str="actno"+actno+"balance"+bal;
  return str;
}

}

class Saving extends Account
{
   int interest=200;
    void deposit(float amt)
    {
    bal=bal+amt+interest;
    }
    void withdrawl(float amt)
        {
        bal=bal-amt;
    }


}

    class Current extends Account
    {

       void deposit(float amt)
           {
           bal=bal+amt;
           }
       void withdrawl(float amt)
           {
           bal=bal-amt;
           }
    }

    class Abstract4
{
    public static void main(String args[])
    {
        Account act=null;
       Scanner s=new Scanner(System.in);
       System.out.println("enter actno");
       int actno=s.nextInt();
       System.out.println("enter amount");
       int amt=s.nextInt();
       System.out.println("enter saving or current type:");
       String acttype=s.next();
        System.out.println("enter what you want to do deposit or withdrawl:");
       String ans=s.next();

       String result="";

       if(acttype.equals("Saving"))
          {
              act=new Saving();
	      act.actno=actno;
	if(ans.equals("deposit"))
	   {
	      act.deposit(amt);

           }

         else if(ans.equals("withdrawl"))
           {
	      act.withdrawl(amt);

	   }
	      result=act.showbalance();
	   }
	    else if(acttype.equals("Current"))
	   {
	      	act=new Current();
	      	act.actno=actno;
	       if(ans.equals("deposit"))
		  {
		      act.deposit(amt);

		   }

		 else if(ans.equals("withdrawl"))
		   {
		       act.withdrawl(amt);

		    }
		result=act.showbalance();

	   }
	   else
	   {
		   System.out.println("invalid inputs");
	   }

	   System.out.println(result);
    }

}



