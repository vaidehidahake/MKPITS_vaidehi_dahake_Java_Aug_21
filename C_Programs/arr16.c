#include<stdio.h>
int main()
{
	int arr[2][4];
	int row,col;
	for(row=0;row<2;row++)
	{
		for(col=0;col<4;col++)
		{
			printf("enter number :");
		    scanf("%d",&arr[row][col]);
		}
	}
	for(row=0;row<2;row++)
	{
		for(col=0;col<4;col++)
		{
			printf("\t%d",arr[row][col]);
		   
		}
		printf("\n");
	}
return 0;	
}
