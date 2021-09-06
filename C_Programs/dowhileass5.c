//7 wap to accept a number and print factorial of a number using do while loop.
#include<stdio.h>
int main()
{
	int n;
	char ans;
		printf("enter number :");
		scanf("%d",&n);
	do
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
		
		n--;
		}
		printf("fact=%d",fact);
		printf("\ndo you want to continue if yes press y otherwise n");
		fflush(stdin);
		scanf("%c",&ans);

		
	}while(ans=='y');
	printf("\n bye");
	
	
	
	
	
}
