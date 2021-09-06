#include<stdio.h>
int main()
{
	int num;
	printf("enter number :");
	scanf("%d",&num);
	int rem;
	int fact;
	int originalnum=num;
	int sum=0;
while(num!=0)
	{
		rem=num%10;
	printf("\nremainder=%d",rem);
	num=num/10;
	printf("\nnum=%d",num);
	fact=factorial(rem);
	sum=sum+fact;
	
	}
	if(originalnum==sum)
	{
		printf("\n n[%d] is a strong number",originalnum);
	}
	else
	{
		printf("\n n[%d] is not a strong number",originalnum);
	}
}
int factorial(int r)
{
	int f=1;
	while(r>0)
	{
		f=f*r;
	r--;
	}
	return f;
}
