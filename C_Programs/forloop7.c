#include<stdio.h>
int main()
{
	int marks,total,i;
	float percentage;

	for(i=1;i<=5;i++)
	{
		printf("enter marks");
		scanf("%d",&marks);
		total=total+marks;
	}
	printf("\ntotal is =%d",total);
	percentage=(total/500.0f)*100.0f;
	printf("\npercentage is=%.2f",percentage);
	if(percentage>=75)
	{
		printf("\nDistinction");
	}
	else if(percentage>=60 && percentage<75)
	{
		printf("\nFirst class");
	}
	else 
	{
		printf("fail");
	}
}
