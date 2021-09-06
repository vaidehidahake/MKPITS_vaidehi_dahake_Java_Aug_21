//12-wap to accept a no and print whether it a prime no. or not.
#include<stdio.h>
int main()
{
	int n;
	printf("enter number :");
	scanf("%d",&n);
	calculate_primeno(n);
}
void calculate_primeno(int n)
{
	int i;
	for(i=2;i<n;i++)
	{
		if(n%i==0)
	{
		printf("\n Not a prime number");
		break;
	}	
	}
	if(i==n)
	{
		printf("\n It is a prime number");
	}

}																							
