//12 - wap to create a function factorial with one int parameter , calculate factorial and return the factorial.
#include<stdio.h>
int factorial(int n)
{
	int fact=1;
	while(n>0)
	{
		fact=fact*n;
		n--;
	}
	return fact;
}
int main()
{
	int num,result;
	printf("\nenter number :");
	scanf("%d",&num);
	result=factorial(num);
	printf("\nresult =%d",result);
	printf("\nBye");
}
