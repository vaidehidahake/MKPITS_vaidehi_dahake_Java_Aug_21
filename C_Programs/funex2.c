//2 wap to check whether amount to be deposited or withdrawl.
#include<stdio.h>
int main()
{
	int actno,amount;
	int bal=2000;
	printf("enter account number :");
	scanf("%d",&actno);
	printf("\nenter amount :");
	scanf("%d",&amount);
	deposit(actno,amount,bal);
    withdrawl(actno,amount,bal);
	show_balance(actno,bal);
	
	
}
void deposit(int actno,int amount,int bal)
{ 
if(amount>0)
{
		bal=bal+amount;
	printf("\nactno=%d",actno);
	printf("\nbalance after deposited amount=%d",bal);
}
else
{
	printf("\n amount deposited should be greater than 0");
}
}
void withdrawl(int actno,int amount,int bal)
{
	if(amount<=bal)
{
		bal=bal-amount;
	printf("\nactno=%d",actno);
	printf("\nbalance after deposited amount=%d",bal);
}
else
{
	printf("\n insuficient balance to withrawl amount");
}
}
void show_balance(int actno,int bal)
{
		printf("\nactno=%d",actno);
	printf("\nbalance in the account=%d",bal);
}
