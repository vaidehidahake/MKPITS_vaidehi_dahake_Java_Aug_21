#include<stdio.h>
int main()
{
	int n1,n2,result=0;
	char op;
	printf("enter two numbers");
	scanf("%d%d",&n1,&n2);
	printf("enter operators like +,-,*,/");
	fflush(stdin);
	scanf("%c",&op);
	switch(op)
	{
		case '+':
			result=n1+n2;
			break;
		case '-':
			result=n1-n2;
			break;
		case '*':
			result=n1*n2;
			break;
		case '/':
			result=n1/n2;
			break;
		default:
			printf("\n Invalid operator");
			break;			
	}
	printf("\nresult is=%d",result);
	getch();
	return 0;
}
