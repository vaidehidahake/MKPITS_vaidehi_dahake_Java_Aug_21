//Example-4 of Abstract class that has an abstract method.
import java.util.*;
abstract class Account
{
  int actno;
  int bal=2000;
abstract String deposit(int actno,int amt);
 String withdrawl(int actno,int amt)
 {
    this.actno=actno;
    if(amt>bal)
    {
    return "Insufficient amount";
    }
    else
    {
     bal=bal-amt;
     return "bal in account after withdrawn"+bal;
    }
  }
}

class Saving extends Account
{
	int interest=500;

    String deposit(int actno,int amt)
    {

      this.actno=actno;
      bal=bal+amt+interest;
     return "bal in account after deposited"+bal;
    }


}

    class Current extends Account
    {

        String deposit(int actno,int amt)
           {
             this.actno=actno;
             bal=bal+amt;
             return "current amount in account after deposition"+bal;
           }
    }

    class Abstract3
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in);
       System.out.println("enter actno");
       int actno=s.nextInt();
       System.out.println("enter amount");
       int amt=s.nextInt();
       System.out.println("enter saving or current type:");
       String acttype=s.next();
        System.out.println("enter what you want to do deposit or withdrawl:");
       String ans=s.next();
       Account act=null;
       String str;

       if(acttype.equals("Saving"))
       {
		   act=new Saving();
	   }
	    else if(acttype.equals("Current"))
	   {
	   	   act=new Current();
	   }
	   else
	   {
		   System.out.println("invalid type");
	   }

	   if(ans.equals("deposit"))
	   {
		  str=act.deposit(actno,amt);
		  System.out.println(str);
	   }

	    else if(ans.equals("withdrawl"))
	   	{
	   		 str=act.withdrawl(actno,amt);
	   		 System.out.println(str);
	     }


    }

}



