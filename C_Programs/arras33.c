//33	Write a program in C to display the number in reverse order.																							
//Input a number: 123																							
//Expected Output :																							
//The number in reverse order is : 321
#include<string.h>
int main()
{

int num;
printf("Input a number:");
scanf("%d",&num);
reverse(num);

}
void reverse(int num)
{
	int rnum=0,r;
	while(num>0)
	{
		r=num%10;
		rnum=rnum*10+r;
		num=num/10;
	}
	printf("\nThe number in reverse order is=%d",rnum);
}

																							

