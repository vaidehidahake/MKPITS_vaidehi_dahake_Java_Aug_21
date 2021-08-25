#include<stdio.h>
int main()
{
	int i;
	int num[3];
	for(i=0;i<3;i++)
	{
		printf("enter number :");
		scanf("%d",&num[i]);
	}
	for(i=0;i<3;i++)
	{
		printf("\nnum[%d]=%d",i,num[i]);
	}
	
	return 0;
	
}
