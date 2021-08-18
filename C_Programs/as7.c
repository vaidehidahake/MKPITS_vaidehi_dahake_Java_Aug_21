#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("enter two numbers");
	scanf("%d%d%d",&n1,&n2,&n3);
	if(n1<n2 && n1<n3)
	{
		printf("\nn1 is smallest");
	}
	else if(n2<n3)
	{
		printf("\nn2 is smallest");
	}
	else
	{
		printf("\nn3 is smallest");	
	}
	return 0;
}
