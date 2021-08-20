
#include<stdio.h>
int main()
{
	int n1,n2;
	int result=0;
	char op;
	printf("enter two numbers");
	scanf("%d%d",&n1,&n2);
	printf("enter operators like +,-,*");
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
		else 
	{
		printf("invalid operator");
	}
	printf("\nresult is =%d",result);
	getch();
	return 0;
}
