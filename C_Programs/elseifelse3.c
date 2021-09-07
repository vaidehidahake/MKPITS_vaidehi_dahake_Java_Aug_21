#include<stdio.h>
int main()
{
	int s1,s2,s3,total;
	float per;
	printf("enter three sub marks");
	scanf("%d%d%d",&s1,&s2,&s3);
	total=s1+s2+s3;
	printf("\n total=%d",total);
	per=(float)(total/300.0f)*100.0f;
	printf("\n percentage=%f",per);
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
