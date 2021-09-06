//4 wap to accept actno,amount,and transaction(whether you want to deposit or withdrawl or showbalance) 
//and call the appropriate function.
#include<stdio.h>
int main()
{
	int actno,amount;
	int bal=2000;
	char transaction[20];
	printf("enter account number :");
	scanf("%d",&actno);
	printf("\nenter amount :");
	scanf("%d",&amount);
	printf("\nenter transaction type:deposit or withdrawl :");
	scanf("%s",&transaction);
	if(strcmp(transaction,"deposit")==0)
	{
	   bal=deposit(actno,amount,bal);
	   show_balance(actno,bal);	
	}
	if(strcmp(transaction,"withdrawl")==0)
	{
	   bal=withdrawl(actno,amount,bal);
       show_balance(actno,bal);
	}
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
