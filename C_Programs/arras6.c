//6-wap to accept 3 subject marks and print total,per and grade.
#include<stdio.h>
int main()
{
	int s1,s2,s3;
	printf("enter three sub marks :");
	scanf("%d%d%d",&s1,&s2,&s3);
	calculate_total(s1,s2,s3);
}							
void calculate_total(int s1,int s2,int s3)
{
	int tot;
	float per;
	tot=s1+s2+s3;
	printf("\ntotal marks =%d",tot);
	per=(float)(tot/300.0f)*100.0f;
	printf("\npercentage =%f",per);
	if(per>=75)
	{
		printf("\n A grade");
	}
	else if(per>=60 && per<75)
	{
		printf("\n B grade");
	}
	else
	{
		printf("\n Fail");
	}
	return 0;
}																
