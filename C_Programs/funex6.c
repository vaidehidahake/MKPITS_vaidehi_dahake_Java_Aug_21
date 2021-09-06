//6-wap to accept ticketno,amount,and transaction(whether you want to deposit or withdrawl or showbalance) 
//and call the appropriate function.
#include<stdio.h>

int main()
{
	int ticketno,amount;
	int bal=89000;
	char paymentmode[30];
	
	printf("enter ticketno :");
	scanf("%d",&ticketno);
	printf("\nenter amount :");
	scanf("%d",&amount);
	printf("\nenter payment mode:paytm or googlepay :");
	scanf("%s",&paymentmode);
	if(strcmp(paymentmode,"paytm")==0)
	{
	   bal=paytm(ticketno,amount,bal);
       show_balance(ticketno,bal);
	}
	if(strcmp(paymentmode,"googlepay")==0)
	{
	   bal=googlepay(ticketno,amount,bal);
       show_balance(ticketno,bal);
	}

	}

int paytm(int ticketno,int amount,int bal)
{
	if(amount<=bal)
{
		bal=(bal-amount)+15;
	printf("\nticketno=%d",ticketno);
	printf("\nbalance after paying amount=%d",bal);
	
}
else
{
	printf("\n insuficient balance to withrawl amount");
}
return bal;
        
}
int googlepay(int ticketno,int amount,int bal)
{
	if(amount<=bal)
{
		bal=(bal-amount)+10;
	printf("\nticketno=%d",ticketno);
	printf("\nbalance after paying amount=%d",bal);
	
}
else
{
	printf("\n insuficient balance to withrawl amount");
}
return bal;
        
}
void show_balance(int ticketno,int bal)
{
		printf("\nticketno=%d",ticketno);
	printf("\nbalance in the account=%d",bal);
}
