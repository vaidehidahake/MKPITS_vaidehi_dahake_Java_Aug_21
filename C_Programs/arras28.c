//28-create a function to calculate volume of a box.
#include<stdio.h>
void calvol()
{
	int l,b,h,volume;
	printf("enter length and breadth and height :");
	scanf("%d%d%d",&l,&b,&h);
	volume=l*b*h;
	printf("\nvolume of a box=%d",volume);
}
int main()
{
	calvol();
	printf("\nbye");
}																													
