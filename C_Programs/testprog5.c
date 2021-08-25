#include<stdio.h>
int main()
{
	int age;
	printf("enter age");
	scanf("%d",&age);
	if(age>=18)
	{
		printf("\nCandidate is eligible to cast is his/her vote");
		
	}
	else
	{
		printf("\nCandidate is not eligible to cast is his/her vote");
	}
	return 0;
}
