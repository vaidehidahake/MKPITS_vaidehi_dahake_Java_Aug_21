//5-wap to print greater of 3 no.
#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("enter two numbers :");
	scanf("%d%d%d",&n1,&n2,&n3);
	greater_number(n1,n2,n3);
}
void greater_number(int n1, int n2, int n3)
{
	if(n1>n2 && n1>n3)
	{
		printf("\n n1 is greater");
	}
	else if(n2>n3)
	{
		printf("\n n2 is greater");
	}
	else
	{
		printf("\n n3 is greater");
	}
	return 0;
}																																													
