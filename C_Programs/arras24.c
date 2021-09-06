//24-create a function to print table of a number.
#include<stdio.h>
void table()
 {
 int n,result,i;
 printf("\nenter number :");
 scanf("%d",&n);
 for(i=1;i<=10;i++)
 {
 	result=n * i;
 
 printf("\n%d*%d=%d",n,i,result);	
}
}
int main()
{
	table();
	printf("\nbye");
}																													
