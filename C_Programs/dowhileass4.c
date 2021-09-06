//9 - wap to accept 5 subject marks using  while loop and print the sum of 5 subjects.
//and percentage and print grade.
#include<stdio.h>
int main() {
	int marks,sum,i=1;
	float per;
	do
	{
		printf("enter marks[%d] ",i);
		scanf("%d",&marks);
		sum=sum+marks;  
		i++;
	}while(i<=5);
	printf("\n sum of 5 subject marks = %d",sum);
	per=(float) (sum/500.0f) * 100.0f;
	printf("\n percentage = %.2f",per);
	if(per>=75)
	{
		printf("\nA");
	}
	else if(per>=60&&per<75)
	{
		printf("\nB");
	}
	else
	{
		printf("\nFail");
	}
	
}
 

