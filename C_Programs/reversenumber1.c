//wap to accept a 3 digit no. and print the reverse of that no.
//for eg num =123
//then reverse of no. is 321
#include<stdio.h>
int main()
{
	int n;
	printf("enter number :");
	scanf("%d",&n);
	reverse(n);
}
void reverse(int n)
{
	int rn=0,r;
	while(n>0)
	{
			r=n%10;
	rn=rn*10+r;
	n=n/10;
	}
	printf("\nthen reverse of no. is=%d",rn);

}
