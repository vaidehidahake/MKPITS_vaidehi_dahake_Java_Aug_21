//34-Write a program in C to check whether a number is a palindrome or not.																							
//Input a number: 121																							
//Expected Output :																							
//121 is a palindrome number.																							
#include <stdio.h>

void main()
{
    int num,r,sum=0,t;

    printf("Input a number: ");
    scanf("%d",&num);

    for(t=num;num!=0;num=num/10)
	{
         r=num % 10;
         sum=sum*10+r;
    }
    if(t==sum)
	{
	
         printf("%d is a palindrome number.\n",t);
     }
    else
    {
	
         printf("%d is not a palindrome number.\n",t);
     }

}

