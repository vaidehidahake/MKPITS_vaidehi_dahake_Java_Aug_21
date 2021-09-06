//wap to accept account no. and amount and initial_bal=1000 and 
//create function deposit, withdrawl and show_balance .
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
	bal=bal+amount;
	printf("\nactno=%d",actno);
	printf("\nbalance after deposited amount=%d",bal);
}
void withdrawl(int actno,int amount,int bal)
{
	bal=bal-amount;
		printf("\nactno=%d",actno);
	printf("\nbalance after withdrawl=%d",bal);
}
void show_balance(int actno,int bal)
{
		printf("\nactno=%d",actno);
	printf("\nbalance in the account=%d",bal);
}
