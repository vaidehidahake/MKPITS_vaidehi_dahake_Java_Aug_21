package bank;
//import sbi.*;
public class Cust
{
 public static void main(String args[])
{
 // fully qualified naming.
sbi.Account act=new sbi.Account();
String str=act.deposit(200);
System.out.println(str);
}

}
