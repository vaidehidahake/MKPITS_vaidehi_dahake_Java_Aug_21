//11- wap to create a function calculate with 3 parameters (2 int and one char to accept 2 no. and operator) 
//calculate and return the result

#include<stdio.h>
int calculate(int n1,int n2,char op)
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
	return result;
}
int main()
{
	int n1,n2,res;
	char op;
	printf("\nenter two numbers :");
	scanf("%d%d",&n1,&n2);
	printf("\noperators like +,-,*");
	fflush(stdin);
	scanf("%c",&op);
	res=calculate(n1,n2,op);
	printf("\nresult=%d",res);
	printf("\nBye");
	
}
