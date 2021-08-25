#include <stdio.h>
void sum(int n1,int n2)
{
	int addition;
	addition=n1+n2;
	printf("\naddition is =%d",addition);
}
int main()
{
	int n1,n2;
	printf("\nenter two numbers :");
	scanf("%d%d",&n1,&n2);
	sum(n1,n2);
	printf("\nbye");
	return 0;
	
}
