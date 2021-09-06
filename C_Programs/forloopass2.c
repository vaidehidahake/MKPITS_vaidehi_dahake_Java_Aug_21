//2-print prime number from 1 to n.
#include<stdio.h>
int main()
{
	int n,i,j;
	printf("enter number of elements :");
	scanf("%d",&n);
	printf("\n prime number from 1 to %d",n);
	for(i=2;i<=n;i++)
	{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				break;
			}
		}
		if(i==j)
		{
			printf("\n%d",i);
		
		}
	}
}
