#include<stdio.h>
int main()
{
	int customerid,unit;
	float amountcharge,surchargeamount,netamount;
	char name[10];
	printf("enter customer id :");
	scanf("%d",&customerid);
	printf("enter customer name :");
	scanf("%s",&name);
	printf("enter unit consumed by customer :");
	scanf("%d",&unit);
	if(unit==199)
	{
		amountcharge=unit*1.20;
	}
	else if(unit>=200 && unit<=400)
	{
		amountcharge=unit*1.50;
	}
	else if(unit>=400 && unit<=600)
	{
		amountcharge=unit*1.80;
	}
	else if(unit>=600 )
	{
		amountcharge=unit*2.00;
	}
	else
	{
		printf("\ninvalid unit");
	}
	printf("\namount charge =%.2f",amountcharge);
	surchargeamount=(float)(15/100.0f)*amountcharge;
	printf("\nsurcharge amount =%.2f",surchargeamount);
	netamount=amountcharge+surchargeamount;
	printf("\nnet amount paid by the customer =%.2f",netamount);
	return 0;
}
