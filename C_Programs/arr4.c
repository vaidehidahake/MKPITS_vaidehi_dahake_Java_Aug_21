#include<stdio.h>
int main()
{
	int i;
	float num[5];
	for(i=0;i<5;i++)
	{
		printf("enter number :");
		scanf("%f",&num[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("\nnum[%d]=%f",i,num[i]);
	}
	
	return 0;
	
}
