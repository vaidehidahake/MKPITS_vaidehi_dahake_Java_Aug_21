//3 wap to create function deposite ,withdrawl returning bal.
#include<stdio.h>
int main()
{
	int actno,amount;
	int bal=2000;
	printf("enter account number :");
	scanf("%d",&actno);
	printf("\nenter amount :");
	scanf("%d",&amount);
	bal=deposit(actno,amount,bal);
    bal=withdrawl(actno,amount,bal);
	show_balance(actno,bal);
	
	
}
int deposit(int actno,int amount,int bal)
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
return bal;
}
int withdrawl(int actno,int amount,int bal)
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
return bal;
}
void show_balance(int actno,int bal)
{
		printf("\nactno=%d",actno);
	printf("\nbalance in the account=%d",bal);
}
