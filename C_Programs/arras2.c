//2 Write a program in C to display the n terms of square natural number and their sum.																							
//1 4 9 16 ... n Terms																							
//Test Data :																							
//Input the number of terms : 5																							
//Expected Output :																							
//The square natural upto 5 terms are :1 4 9 16 25																							
//The Sum of Square Natural Number upto 5 terms = 55
#include<stdio.h>
int main()
{
	int n;
	printf("Input number of terms :");
	scanf("%d",&n);
	calculate_sqaure(n);
}
void calculate_sqaure(int n)
{
	int i,sq,sum=0;
	printf("\nsquare of natural numbers are :");
	for(i=1;i<=n;i++)
	{
		sq=i*i;
		printf("\t%d",sq);
		sum=sum+sq;
		
	}
	printf("\nThe Sum of Square Natural Number upto 5 terms =%d",sum);
	return 0;
}
