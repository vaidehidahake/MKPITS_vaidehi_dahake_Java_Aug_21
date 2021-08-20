#include<stdio.h>
int main()
{
	int s1,s2,s3,total;
	float percentage;
	printf("enter subject marks");
	scanf("%d%d%d",&s1,&s2,&s3);
	total=s1+s2+s3;
	printf("total =%d",total);
	percentage=total/300.0f*100.0f;
	printf("\npercentage =%f",percentage);
	
	if(percentage>=75)
	{
		printf("\ndistinction");
	}
	else if(percentage>=60 && percentage<75)
	{
		printf("\nfirst class");
	}
    else if(percentage>=45 && percentage<60)
	{
		printf("\nsecond class");
	}
	else 
	{
		printf("\nfail");
	}
	return 0;
}
