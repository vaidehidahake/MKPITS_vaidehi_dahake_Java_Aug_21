#include<stdio.h>
int main()
{
	int n1,n2,result;
	char op;
	printf("enter two numbers");
	scanf("%d%d",&n1,&n2);
	printf("\nenter operators like +,-,*,/");
	fflush(stdin);
	scanf("%c",&op);
	if(op=='+')
	{
		result=n1+n2;
	}
	else if(op=='-')
	{
		result=n1-n2;
	}
	else if(op=='*')
	{
		result=n1*n2;
	}
	else if(op=='/')
	{
		result=n1/n2;
	}
	else
	{
		printf("invalid operator");
	}
	printf("result is=%d",result);
	return 0;
}
