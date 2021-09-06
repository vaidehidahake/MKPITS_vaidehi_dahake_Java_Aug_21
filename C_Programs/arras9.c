//9-wap to accept empname and designation and salary calculate bonus.
#include<stdio.h>
void calculate_bonuscal(float salary,float bonus);
int main()
{
	char empname[20];
	char designation[20];
	float salary,bonus;
	printf("enter employee name :");
	scanf("%s",&empname);
	printf("enter employee designation :");
	scanf("%s",&designation);
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
