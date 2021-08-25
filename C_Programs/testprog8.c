#include<stdio.h>
int main()
{
	int rollno,s1,s2,s3,total;
	char name[10];
	float per;
	printf("enter rollno :");
	scanf("%d",&rollno);
	printf("\nenter name :");
	scanf("%s",&name);
	printf("\nenter three subject marks :");
	scanf("%d%d%d",&s1,&s2,&s3);
	total=s1+s2+s3;
	printf("\ntotal is =%d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("\nper is=%f",per);
	if(per>=75)
	{
		printf("\ndistinction");
	}
	else if(per>=60 && per<75)
	{
		printf("\nfirst class");
	}
	else if(per>=45 && per<60)
	{
		printf("\nsecond class");
	}
	else
	{
		printf("\nfail");
	}
	return 0;
}
