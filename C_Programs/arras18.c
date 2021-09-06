//18-wap to create a function calculate with two integer arguments and																							
//return the addition of two arguments.
#include<stdio.h>
int calculate(int n1, int n2)
{
	int result;
	printf("enter 2 no.");
	scanf("%d%d",&n1,&n2);
	result=n1+n2;
	printf("\n the addition of two arguments =%d",result);
	return result;
}


int main()
{
	int n1,n2,res;
   res=calculate(n1,n2);
printf("\nres=%d",res);
printf("\n bye from main function");
}
																														

