//12- wap to print fabonachii series using for loop.
	#include<stdio.h>
	int main()
	{
 int n,n1=0,n2=1,n3,i;
 printf("Input number of terms to display : ");
 scanf("%d",&n);
 printf("\nHere is the Fibonacci series upto to 10 terms :\n");
 printf("\t%d\t%d",n1,n2);
 for(i=3;i<=n-2;i++)
 {
 	n3=n1+n2;
 	printf("\t%d",n3);
 	n1=n2;
 	n2=n3;
 }
 																								
}																							

