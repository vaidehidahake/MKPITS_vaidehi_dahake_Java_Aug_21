#include<stdio.h>
int main()
{
	int radius;
	float area,circ;
	printf("enter radius of circle\n");
	scanf("%d",&radius);
	area=3.14f*radius*radius;
	circ=2*3.14f*radius;
	printf("area of circle=%f",area);
	printf("\ncirc of circle=%f",circ);
}
