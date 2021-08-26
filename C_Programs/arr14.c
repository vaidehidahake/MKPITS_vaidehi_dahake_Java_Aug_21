#include<stdio.h>
int main()
{
	int arr[3][3];
	int row,col;
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("enter number :");
		    scanf("%d",&arr[row][col]);
		}
	}
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("\t%d",arr[row][col]);
		   
		}
		printf("\n");
	}
return 0;	
}
