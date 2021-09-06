//21-create a function to check whether no is even or odd.
#include<stdio.h>
void check()
{
	int n;
	printf("enter number :");
	scanf("%d",&n);
	if(n%2==0)
	{
		printf("\nEven");
	}
	else
	{
	    printf("\nOdd");	
	}
}
int main()
{
	check();
	printf("\nbye");
}
																																														
