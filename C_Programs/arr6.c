#include<stdio.h>
int main()
{
	int i;
	char ch[5];
	for(i=0;i<5;i++)
	{
		printf("enter character :");
		fflush(stdin);
		scanf("%c",&ch[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("%c",ch[i]);
	}
	
	return 0;
	
}
