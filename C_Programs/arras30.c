//30-Write a C program to determine whether a given number is prime or not.
#include<stdio.h>
void prime()
{
	int n,i;
	printf("enter number :");
	scanf("%d",&n);
	for(i=2;i<n;i++)
	{
		if(n%i==0)
	{
		printf("\n Not a prime number");
		break;
	}	
	}
	if(i==n)
	{
		printf("\n It is a prime number");
	}

}
int main()
{
	prime();
	printf("\n bye");
}																														
