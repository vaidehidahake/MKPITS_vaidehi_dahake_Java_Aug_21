#include<stdio.h>
int main()
{
	int temp;
	printf("enter temperature in centigrade:");
	scanf("%d",&temp);
	if(temp<0)
	{
		printf("\nFreezing Weather");
	}
	else if(temp>=0 && temp<=10)
	{
		printf("\nVery Cold weather");
	}
	else if(temp>=11 && temp<=20)
	{
		printf("\nCold Weather");
	}
	else if(temp>=31 && temp<=40)
	{
		printf("\nNormal in Temperature");
	}
	else if(temp>=40)
	{
		printf("\n Very Hot Weather");
	}
	
	return 0;
}
