#include<stdio.h>
int main()
{
	int i;
	int num[3];
	int sum=0;
	for(i=0;i<3;i++)
	{
		printf("enter number :");
		scanf("%d",&num[i]);
		sum=sum+num[i];
	}
	printf("\nsum is =%d",sum);

	
	return 0;
	
}
