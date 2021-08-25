#include<stdio.h>
int main()
{
	int row,col;
	for(row=1;row<=3;row++)
	{
		for(col=3;col>=row;col--)
		{
			printf("\t%d",row);
		}
		printf("\n");
	}
}
