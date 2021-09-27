//ex 4 create a class account having field accountno , bal and  method deposit and withdrawl.
//create a subclass saving inherited from account class and override the deposit(with interest) and withdrawl method.
//create a subclass current  inherited from account  and override the deposit(without interest) and withdrawl method.
import java.util.*;
class Account
{
  int actno;
  int bal=5000;
  String deposit(int actno,int amt)
  {
    return "deposit method of account class";
  }
  String withdraw(int actno,int amt)
    {
      return "withdraw method of account class";
    }
 }

 class Saving extends Account
 {
   int interest=100;
   String deposit(int actno,int amt)
     {
         this.actno=actno;
         bal=bal+amt+interest;
       return "account no of account class:"+actno+"amount deposited in account class:"+bal;
     }
     String withdraw(int actno,int amt)
       {
          this.actno=actno;
          if(amt>bal)
          {
            return "insufficient bal";
          }
          else
          {
	          bal=bal-amt;
       return "account no of account class:"+actno+"amount deposited in account class:"+bal;
       }
    }
 }
  class Current extends Account
  {

    String deposit(int actno,int amt)
      {
          this.actno=actno;
          bal=bal+amt;
        return "account no of account class:"+actno+"amount deposited in account class:"+bal;
      }
      String withdraw(int actno,int amt)
        {
           this.actno=actno;
           if(amt>bal)
           {
             return "insufficient bal";
           }
           else
           {
 	          bal=bal-amt;
        return "account no of account class:"+actno+"amount deposited in account class:"+bal;
        }
     }
 }

 class TestAcOverr3
 {
 public static void main(String args[])
 {
     Scanner scan=new Scanner(System.in);
     System.out.println("enter accno :");
     int actno=scan.nextInt();
      System.out.println("enter amt :");
     int amt=scan.nextInt();
      System.out.println("enter you want to deposit or withdraw :");
     String ans=scan.next();
     Saving sav=null;
	Current cur=null;
	        String str;
	        if(acttype.equals("Saving"))
	        {
	            sav = new Saving();
	            if(ans.equals("deposit"))
	            {
	                str = sav.deposit(actno,amt);
	                System.out.println(str);
	            }
	            else if (ans.equals("withdrawl"))
	            {
	                str = sav.withdrawl(actno,amt);
	                System.out.println(str);
	            }
	        }
	        if(acttype.equals("Current"))
	        {
	            cur = new Current();
	            if(ans.equals("deposit"))
	            {
	                str = cur.deposit(actno,amt);
	                System.out.println(str);
	            }
	            else if (ans.equals("withdrawl"))
	            {
	                str = cur.withdrawl(actno,amt);
	                System.out.println(str);
	            }
	        }

	    }
	}

