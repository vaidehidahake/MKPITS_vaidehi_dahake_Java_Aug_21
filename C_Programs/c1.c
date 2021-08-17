#include<stdio.h>
void main()
{
	char ch;
	printf("enter character");
	scanf("%c",&ch);
	printf("character is =%c",ch);
	
	printf("\nenter another character");
	ch=getch();
	printf("\ncharacter is =%c",ch);
	
	printf("\nenter another character");
	ch=getche();
	printf("\ncharacter is =%c",ch);
}
