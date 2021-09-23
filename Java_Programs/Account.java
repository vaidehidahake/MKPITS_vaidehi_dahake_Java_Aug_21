package sbi;
public class Account
{
   int bal=2000;
public String deposit(int amt)
{
   bal=bal+amt;
   return "amount deposited,then the bal is"+bal;
}
}