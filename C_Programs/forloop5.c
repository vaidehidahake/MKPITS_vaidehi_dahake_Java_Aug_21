#include<stdio.h>
int main()
{
	int num,fact=1,i;
	printf("enter a number");
	scanf("%d",&num);
	for(i=num;i>0;i--)
	{
		fact=fact*i;
		
	}
	printf("factorial=%d",fact);
}
