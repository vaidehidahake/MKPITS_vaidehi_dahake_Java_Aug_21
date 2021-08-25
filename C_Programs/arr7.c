#include<stdio.h>
int main()
{
	int i;
	double num[5];
	for(i=0;i<5;i++)
	{
		printf("enter number :");
		
		scanf("%lf",&num[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("\nnum=%lf",num[i]);
	}
	
	return 0;
	
}
