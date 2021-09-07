//13-wap to add two string using strcat function.
#include<string.h>
int main()
{
    char firstname[20];
	char lastname[20];
	printf("enter firstname :");
	gets(firstname);
	printf("enter lastname :");
	gets(lastname);
	strcat(firstname,lastname);
	printf("\nfirstname =%s",firstname);
	
}
