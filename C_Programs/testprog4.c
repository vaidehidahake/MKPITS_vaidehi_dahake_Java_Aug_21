#include<stdio.h>
int main()
{
	int year;
	printf("enter a year");
	scanf("%d",&year);
	if(year%4==0)
	{
		printf("\nIt is a Leap Year");
	}
	else if(year%400==0)
	{
		printf("\nIt is Leap Year");
	}
	
	else
	{
		printf("\nIt is not a Leap Year");
	}
	return 0;
	
}
