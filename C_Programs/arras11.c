//11-wap to accept a no and print factorial of that number
#include<stdio.h>
int main()
{
	int num;
	printf("enter number :");
	scanf("%d",&num);
	calculate_factorial(num);
}
void calculate_factorial(int num)
{
	int fact=1;
	while(num>0)
	{
		fact=fact*num;
		num--;
	}
	printf("\nfactorial is =%d",fact);
	return 0;
}																							
