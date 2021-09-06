//3	Write a c program to check whether a given number is a perfect number or not.																							
//Input the number : 56																							
//Expected Output :																							
//The positive divisor : 1 2 4 7 8 14 28																							
//The sum of the divisor is : 64																							
//So, the number is not perfect.																							
#include<stdio.h>
int main()
{
	int n;
	printf("Input the number :");
	scanf("%d",&n);
	calculate_perno(n);
}
void calculate_perno(int n)
{
	int i,sum=0;
	printf("\nThe positive divisor :");
	for(i=1;i<n;i++)
	{
		if(n%i==0)
		{
			sum=sum+i;
			printf("\t%d",i);
		}
	
	}
	printf("\nThe sum of the divisor is =%d",sum);
	if(sum==n)
	{
		printf("\n the number is  perfect");
	}
	else
	{
		printf("\n the number is not perfect");
	}

	return 0;
}
