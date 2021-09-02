//3- create a structure employee with members empno,empname,designation and salary.
struct employee
{
	int employeeno;
	char empname[10];
	char designation[10];
	float salary;
}e1;
int main()
{
	printf("enter employee number :");
	scanf("%d",&e1.employeeno);
	printf("\n employee number =%d",e1.employeeno);
	printf("\nenter employee name :");
	scanf("%s",&e1.empname);
	printf("\n name =%s",e1.empname);
	printf("\nenter designation :");
	scanf("%s",&e1.designation);
	printf("\n designation =%s",e1.designation);
	printf("\nenter employee salary :");
	scanf("%f",&e1.salary);
	printf("\n salary =%f",e1.salary);
	
}
