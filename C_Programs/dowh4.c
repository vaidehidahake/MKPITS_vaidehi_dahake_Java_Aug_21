#include<stdio.h>
int main()
{
	int num,result;
	int i=1;
	char ans;
	do
	{
		printf("enter a number");
		scanf("%d",&num);
		i=1;
		while(i<=10)
		{
			result=num*i;
			i++;
		printf("\n %d * %d = %d",num,i,result);
			
		}
		printf("\ndo you want to continue press y otherwise n");
		fflush(stdin);
		scanf("%c",&ans);
}while(ans=='y');
}
