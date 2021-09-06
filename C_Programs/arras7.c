//7-wap to accept empname,salary and calculate bonus.
#include<stdio.h>
void calculate_bonuscal(float salary,float bonus);
int main()
{
	char empname[20];
	float salary,bonus;
	printf("enter employee name :");
	scanf("%s",&empname);
	printf("\nenter employee salary :");
	scanf("%f",&salary);
	printf("\nenter employee bonus :");
	scanf("%f",&bonus);
	calculate_bonuscal(salary,bonus);
}
void calculate_bonuscal(float salary,float bonus)
{
	float bonuscal;
	bonuscal=salary+bonus;
	printf("\ntotalbonus =%f",bonuscal);
}																							
