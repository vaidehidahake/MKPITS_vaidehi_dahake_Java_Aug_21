#include<stdio.h>
int main()
{
	int  i,j;
	printf("\n prime number from 1 to 20");
	for(i=2;i<=20;i++)
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
