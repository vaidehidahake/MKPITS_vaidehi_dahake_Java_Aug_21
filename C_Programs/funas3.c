//10 - wap to create function calarea with one int parameter to accept radius
#include<stdio.h>
void calarea(int r)
{
	float area,circ;
	area=3.14f*r*r;
	printf("\narea of circle =%f",area);
	circ=2*3.14*r;
	printf("\ncircumference of circle =%f",circ);
}
int main()
{
	int r;
	printf("\n enter radius :");
	scanf("%d",&r);
	calarea(r);
	printf("\nBye");
}
