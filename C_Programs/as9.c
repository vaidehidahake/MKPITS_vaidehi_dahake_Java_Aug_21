#include<stdio.h>
int main()
{
	int salary;
	printf("enter salary");
	scanf("%d",&salary);
	if(salary>=10000)
	{
		printf("your bonus will be 1000");
	}
	else if(salary>=5000 && salary<10000)
	{
		printf("your bonus will be 500");
	}
	else if(salary<5000)
	{
		printf("your bonus will be 100");
	}
	else
	{
		printf("no bonus");
	}
	return 0;
	
}
