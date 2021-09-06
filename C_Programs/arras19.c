//19-wap to create a function calculate with 3 float arguments and																							
//return the addition of 3 float numbers.
#include<stdio.h>

float calculate(float n1,float n2,float n3)
{
	float result;
	printf("enter 3 no.");
	scanf("%f%f%f",&n1,&n2,&n3);
	result=n1+n2+n3;
	printf("\n the addition of 3 float numbers =%f",result);
	return result;
}


int main()
{
	float n1,n2,n3,res;
   res=calculate(n1,n2,n3);
printf("\nres=%f",res);
printf("\n bye from main function");
}
																														
																							

