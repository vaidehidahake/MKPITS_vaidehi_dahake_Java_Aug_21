#include<stdio.h>
int main()
{
	int num, i,j;
	printf("enter number");
	scanf("%d",&num);
	for(i=2;i<=20;i++)
	{
		for(j=2;j<i;j++)
		{
			if(num%i==0)
			{
				printf("\nnot prime number");
				break;
			}
		}
		if(num==i)
		{
			printf("\nprime number");
		
		}
	}
}
