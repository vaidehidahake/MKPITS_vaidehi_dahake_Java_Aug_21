#include<stdio.h>
void calculate(int n1,int n2,char op)
{
	int result;
	switch(op)
	{
		case'+':
			result=n1+n2;
			break;
		case'-':
			result=n1-n2;
			break;
		case'*':
			result=n1*n2;
			break;
		default:
			printf("\ninvalid operator");
			break;
	}
	printf("\nresult is =%d",result);
}
int main()
{
	int n1,n2;
	char op;
printf("\nenter two numbers :");
	scanf("%d%d",&n1,&n2);
	printf("\nenter operators like +,-,*");
	fflush(stdin);
	scanf("%c",&op);
	calculate(n1,n2,op);
	printf("\nBye");
}
