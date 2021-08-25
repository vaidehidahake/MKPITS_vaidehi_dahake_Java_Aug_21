#include<stdio.h>
int main()
{
	int num,i;
	printf("enter a number");
	scanf("%d",&num);
	for(i=2;i<num;i++)
	{
		if(num%i==0)
		{
			printf("\n not a prime number");
			break;
		}
	}
	if(i==num)
	{
		printf("\n it is a prime number");
	}
	
}
