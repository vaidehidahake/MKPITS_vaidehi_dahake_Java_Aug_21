//program to copy one string into another
#include<string.h>
int main()
{
    char ch[20];
	char ch1[20];
	printf("enter string :");
	gets(ch);
	strcpy(ch1,ch);
	printf("\nstring1=%s",ch);
	printf("\nstring2=%s",ch1);
}
