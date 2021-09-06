//10-wap to print no. from 1 to 10 using while, dowhile and for loop.
#include<stdio.h>
int main()
{
    int n=1;
	calculate_number(n);

}
void calculate_number(int n)
{

 do
 {
 	printf("%d",n);
 	n++;
 	printf("\n");
	 }while(n<=10);
	 
	 return 0;	
}																						
