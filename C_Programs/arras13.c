//13-wap to accept a no and print table of that no.	
#include<stdio.h>
int table(int n)
 {
 int result,i;
 for(i=1;i<=10;i++)
 {
 	result=n * i;
 
 printf("\n%d*%d=%d",n,i,result);	
 
 }
 return result;
     
}
int main()
{
	int num,res;
	printf("\nenter number :");
	scanf("%d",&num);
	res	= table(num);
}											
