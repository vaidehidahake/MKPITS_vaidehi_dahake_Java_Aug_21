//11-wap to find length of a string
#include<string.h>
int main()
{
	int length;
	char ch[20];
	printf("enter string :");
	gets(ch);
	length=strlen(ch);
	printf("\nlength=%d",length);
}
