//22-create a function to calculate factorial of a number.
#include<stdio.h>
void factorial()
{
	int n,fact=1;
	printf("enter number :");
	scanf("%d",&n);
	while(n>0)
	{
		fact=fact*n;
		n--;
	}
	printf("factorial is =%d",fact);
}
int main()
{
	factorial();
	printf("\nbye");
}																							
