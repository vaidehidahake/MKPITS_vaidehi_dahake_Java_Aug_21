#include<stdio.h>
int main()
{
	int s1,s2,s3,s4,s5,total;
	float percentage;
	printf("enter sub marks");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	total=s1+s2+s3+s4+s5;
	printf("total =%d",total);
	percentage=total/500.0f*100.0f;
	printf("\npercentage =%f",percentage);
	
	if(percentage>=75)
	{
		printf("\nDistinction");
	}
	else if(percentage>=60 && percentage<75)
	{
		printf("\nFirst Class");
	}
		else if(percentage>=45 && percentage<60)
	{
		printf("\nSecond Class");
	}
		else 
	{
		printf("\nFail");
	}
	return 0;
}
