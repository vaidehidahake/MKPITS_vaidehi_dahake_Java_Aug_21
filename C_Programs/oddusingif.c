#include<stdio.h>
int main()
{
	int num=1;
	printf("enter number");
	scanf("%d",&num);
	if(num<=10)
	{
		if(num%2 !=0)
		{
			printf("\nno. is odd");
     		
		}
	
		num++;
	}
	else
	{
		printf("\n no. is not odd");
	}
	return 0;
}
