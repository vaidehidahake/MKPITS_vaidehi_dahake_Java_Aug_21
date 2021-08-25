#include<stdio.h>
int main()
{
	int i;
	long int num[3];
	for(i=0;i<3;i++)
	{
		printf("enter number :");
		scanf("%ld",&num[i]);
	}
	for(i=0;i<3;i++)
	{
		printf("\nnum=%ld",num[i]);
	}
	
	return 0;
	
}
