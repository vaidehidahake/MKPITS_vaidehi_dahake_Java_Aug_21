#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("enter three numbers");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1>n2 && n1>n3)
	{
		printf("\nn1 is greater");
	}
	else if(n2>n3)
	{
		printf("\nn2 is greater");
	}
	else
	{
		printf("\nn3 is greater");
	}
	return 0;
}
