//31	Write a program in C to find the prime numbers within a range of numbers.																							
	//Input starting number of range: 1																							
	//Input ending number of range : 50																							
	//Expected Output :																							
	//The prime number between 1 and 50 are :																							
	//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47																							

#include<stdio.h>
int main()
{
	int m,n,i,j;
	printf("Input starting number of range:");
	scanf("%d",&m);
	printf("Input ending number of range:");
	scanf("%d",&n);
	printf("\n prime number from %d to %d\n",m,n);
	for(i=m;i<=n;i++)
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
			printf("\t%d",i);
		
		}
	}
}
