//8-wap to accept character and print whether it is vowel or not.	
#include<stdio.h>
int main()
{
	char ch;
	printf("enter character :");
	fflush(stdin);
	scanf("%c",&ch);
	check_vowel(ch);
}					
void check_vowel(char ch)
{
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
	{
		printf("\n character is vowel");
	}
	else
	{
		printf("\n character is not vowel");
	}
}																	
