//wap to print prime numbers form 1 to 20 using do while loop.
#include<stdio.h>
int main()
{
	int i,j;
	j=2;
	do
	{
	i=2;
		while(i<=j)
		{
			if(j%i==0)
		{
			break;
		}
		i++;
		}
		if(i==j)
	{
		printf("\t%d",j);
	}
	j++;
	}while(j<=20);
	
	
}
