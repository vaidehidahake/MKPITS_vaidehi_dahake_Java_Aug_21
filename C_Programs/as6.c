#include<stdio.h>
int main()
{
	int n1,n2;
	printf("enter two numbers");
	scanf("%d%d",&n1,&n2);
	if(n1<n2)
	{
		printf("\nn1 is smallest");
	}
	else
	{
		printf("\nn2 is smallest");
	}
	return 0;
}
