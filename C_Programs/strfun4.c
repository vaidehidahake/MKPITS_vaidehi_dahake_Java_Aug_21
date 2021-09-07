//wap to compare two string.

#include<string.h>
int main()
{

char firstname[30];
char lastname[15];

printf("enter firstname :");
gets(firstname);
printf("enter lastname :");
gets(lastname);
if(strcmp(firstname,lastname) == 0) 
{
printf("\n both string are same");
}
else 
{
	printf("\n both string are not same");
}

}

