//2 -create a struture student with members rno,name,course, address,mobileno.
struct student
{
	int rno;
	char name[10];
	char course[10];
	char address[30];
	double mobileno;
}s1;
int main()
{
	printf("enter roll number :");
	scanf("%d",&s1.rno);
	printf("\n roll number =%d",s1.rno);
	printf("\nenter student name :");
	scanf("%s",&s1.name);
	printf("\n name =%s",s1.name);
	printf("\nenter course name :");
	scanf("%s",&s1.course);
	printf("\n course =%s",s1.course);
	printf("\nenter student address :");
	scanf("%s",&s1.address);
	printf("\n address =%s",s1.address);
	printf("\nenter mobile number :");
	scanf("%lf",&s1.mobileno);
	printf("\n mobile number =%.0lf",s1.mobileno);
}
