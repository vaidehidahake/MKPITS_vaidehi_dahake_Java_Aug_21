//9 - wap to create function result with 3 int parameters to accept 3 subject marks
//calculate and display total, percentage and grade.

#include<stdio.h>
void result(int s1,int s2,int s3)
{
	int total;
	float per;
	total=s1+s2+s3;
	printf("\n total marks =%d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("\nper =%f",per);
	if(per>=75)
	{
		printf("\nDistinction");
	}
	else if(per>=60 && per<75)
	{
		printf("\nFirst Class");
	}
	else if(per>=40 && per<60)
	{
		printf("\nSecond Class");
	}
	else 
	{
		printf("\nFail");
		
}
}
int main()
{
	int s1,s2,s3;
	printf("enter three sub marks :");
	scanf("%d%d%d",&s1,&s2,&s3);
	result(s1,s2,s3);
	printf("\nBye");
	return 0;
}

