#include<stdio.h>
int main() 
{
	int i;
	int num;
	int originalnum;
	int rem;
	int fact;
	int sum=0;
	for(i=100;i<50000;i++ )
	 {
	 	sum=0;
	 	num=i;
originalnum=num;
		while(num != 0)
			{
				rem=num % 10; // 1 % 10 = 1
				//	printf("\n remainder =%d",rem); 
				num=num / 10; //0
				//	printf("\n num =%d",num); 
				fact=factorial(rem); // passing rem to function to calculate factrial
				sum=sum + fact; //sum= 144 + 1 =145
			}
	
		if(originalnum == sum) 
		{
			printf("\n no[%d]  is strong no. ", originalnum);
		}
		
	}
	
}
//creating a function fact to calculate factorial of a number
int factorial(int r)
{
	int f=1;
	while(r > 0) 
	{
		f=f*r; 
		r=r-1;
	}
	return f;
}

