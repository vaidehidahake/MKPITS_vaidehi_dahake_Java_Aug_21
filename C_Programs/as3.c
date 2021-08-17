#include<stdio.h>
int main()
{
	int sub1,sub2,sub3,sub4,sub5,total,average;
	printf("enter  five subject marks");
	scanf("%d%d%d%d%d",&sub1,&sub2,&sub3,&sub4,&sub5);
    total=sub1+sub2+sub3+sub4+sub5;
    average=total/5;
	printf("total marks of subjects=%d",total);
	printf("average marks of subjects=%d",average);
	
}
