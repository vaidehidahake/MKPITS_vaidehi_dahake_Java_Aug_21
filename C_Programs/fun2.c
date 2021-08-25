#include<stdio.h>
void sayhello()
{
	printf("hello");
}
int main()
{
	sayhello();
	printf("\n again calling function :");
	sayhello();
	printf("\nbye");
	return 0;
}
