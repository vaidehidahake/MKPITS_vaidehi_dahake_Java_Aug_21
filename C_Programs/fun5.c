#include<stdio.h>
void sqaure(int num)
{
	int sqaure;
	sqaure=num*num;
	printf("\nsqaure is =%d",sqaure);
}
int main()
{
	int n1;
	printf("enter a number :");
	scanf("%d",&n1);
	sqaure(n1);
	printf("\nbye");
	return 0;
	
}
