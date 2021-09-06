//4-wap to print greater of 2 no.
#include<stdio.h>
int main()
{
	int n1,n2;
	printf("enter two numbers :");
	scanf("%d%d",&n1,&n2);
	greater_number(n1,n2);
}
void greater_number(int n1, int n2)
{
	if(n1>n2)
	{
		printf("\n n1 is greater");
	}
	else
	{
		printf("\n n2 is greater");
	}
	return 0;
}																						
