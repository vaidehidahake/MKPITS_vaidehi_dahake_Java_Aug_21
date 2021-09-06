//25-create a function to calculate area of traingle.
#include<stdio.h>
void calarea()
{
	int b,h;
	float area;
	printf("enter base and height :");
	scanf("%d%d",&b,&h);
	area=(float)1/2*b*h;
	printf("\narea of triangle=%f",area);
}
int main()
{
	calarea();
	printf("\nbye");
}																							
