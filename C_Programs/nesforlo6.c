#include<stdio.h>
int main()
{
	int row,col;
	for(row=3;row>0;row--)
	{
		for(col=1;col<=row;col++)
		{
			printf("\t%d",col);
		}
		printf("\n");
	}
	
}
