//6 - create a struture employee with members empid, empname , designation , salary.
struct employee
{
	int empid;
	char empname[10];
	char designation[10];
	float salary;
}e1;
int main()
{
	printf("enter employee id :");
	scanf("%d",&e1.empid);
	printf("\n employee id =%d",e1.empid);
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
