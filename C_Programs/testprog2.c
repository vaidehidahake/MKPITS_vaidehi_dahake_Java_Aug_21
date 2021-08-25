#include<stdio.h>
int main()
{
	int num;
	printf("enter number");
	scanf("%d",&num);
	if(num%2==0)
	{
		printf("\nnumber is even");
	}
	else
	{
		printf("\nnumber is odd");
	}
	return 0;
}
