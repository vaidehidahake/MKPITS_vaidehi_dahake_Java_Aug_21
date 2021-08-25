#include<stdio.h>
int main()
{
	int age,total,i;
	float average;
	for(i=1;i<=5;i++)
	{
		printf("enter age");
		scanf("%d",&age);
		total=total+age;
	}
	printf("\ntotal is=%d",total);
	average=(float)(total/5.0f);
	printf("\naverage is=%f",average);
}
