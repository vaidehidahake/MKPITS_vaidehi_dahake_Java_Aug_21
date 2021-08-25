//12 - wap to create a function factorial  , calculate factorial and return the factorial.
#include<stdio.h>
int factorial()
{
	int n,fact=1;
	printf("\nenter number :");
	scanf("%d",&n);
	while(n>0)
	{
		fact=fact*n;
		n--;
	}
	return fact;
}
int main()
{
	int result;
	result=factorial();
	printf("\nres =%d",result);
	printf("\nBye");
}
