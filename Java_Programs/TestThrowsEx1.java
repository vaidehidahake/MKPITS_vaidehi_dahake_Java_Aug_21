//ex-1 throws keyword
import java.io.IOException;
class Account
{
   String deposit(int amt)throws Exception
   {
       return "deposited amount";

   }
 }
 class TestThrowsEx1
 {
 public static void main(String args[])
 {
    Account a=new Account();
    try
    {
    String str=a.deposit(100);
    System.out.println(str);
    }
    catch(Exception ee)
    {
    System.out.println(ee.toString());
    }
    System.out.println("program reached till the end");
 }
}

