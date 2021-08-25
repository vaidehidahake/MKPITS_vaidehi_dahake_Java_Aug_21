#include<stdio.h>
int main()
{
	int p,c,m,total,s;
	printf("enter three subject marks");
	scanf("%d%d%d",&p,&c,&m);
	total=p+c+m;
	printf("\nmarks=%d",total);
	s=m+p;
	printf("\nsub=%d",s);
	if(m>=65 && p>=55 && c>=50)
	{
		printf("\n candidate is eligible");
	}
	else if(total>=190 || s>=140)
	{
		printf("\n candidate is eligible");
	}
	else
	{
		printf("\n candidate is not eligible");
	}
	return 0;
}
