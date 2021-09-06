//15 -Write a C program to check whether a character is an alphabet, digit or special character.
#include<stdio.h>
int main()
{
	char alpha;
	printf("enter character :");
	fflush(stdin);
	scanf("%c",&alpha);
	if((alpha>='A'&&alpha<='Z') || (alpha>='a'&&alpha<='z'))
	{
		printf("\nentered character is alphabet");
	}
	else if(alpha>='0'&&alpha<='9')
	{
		printf("\nentered value is digit");
	}
	else
	{
		printf("\nentered a special character");
	}
}
