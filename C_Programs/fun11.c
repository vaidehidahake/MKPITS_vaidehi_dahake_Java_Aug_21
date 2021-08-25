
#include<stdio.h>
float calculatearea();

int main()
 {
	float result;
	result=calculatearea();
	printf("\n area = %f",result);
	
}

float  calculatearea() 
{
	int radius;
	float area;
	printf("enter radius");
	scanf("%d",&radius);
	
	area = 3.14f  * radius * radius;
	return area;
	
}

