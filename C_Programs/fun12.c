#include<stdio.h>
float calpercentage(int totalmarks );
void displaygrade(float per);
int main() {
int sub1,sub2,sub3,tot;
float per=0.0f;
printf("enter 3 subject marks");
scanf("%d%d%d",&sub1,&sub2,&sub3);
tot=caltotal(sub1,sub2,sub3);
printf("\n total marks = %d",tot);	
per=calpercentage(tot);
printf("\n percentage = %f", per);
displaygrade(per);	
}
int  caltotal(int s1,int s2,int s3)
{
	int total=s1+s2+s3;
	return total;
}
float calpercentage(int totalmarks)
{
	float p;
	p=(float) (totalmarks / 300.0f ) * 100.0f;
	return p;
	
}
void displaygrade(float per)
{
//	printf("\n per=%f",per);
	if(per >= 75 )	
	{
		printf("\n grade = distinction");
	}
	else if(per >= 60 && per < 75 )	
	{
		printf("\n grade = first");
	}
	else if(per >= 40 && per < 60 )	
	{
		printf("\n grade = second division");
	}
	else 
	{
		printf("\n grade=fail");
	}
}

