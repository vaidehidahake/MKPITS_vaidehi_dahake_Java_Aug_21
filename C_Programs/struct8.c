//15 - create a structure to product employee salary statement.
struct employee
{
	int empno;
	char name[20];
	int salary;
	
};

void display(struct employee s1);
#include<stdio.h>
int main() 
{
struct	employee emp[3];
int i=0;
while(i<3 )
{
printf("\nenter empno ");
scanf("%d",&emp[i].empno);
printf("enter employee name ");
scanf("%s",&emp[i].name);
printf("enter salary ");
scanf("%d",&emp[i].salary);
printf("\nemployee[%d] details are",i+1);
display(emp[i]); 
printf("\nemployee[%d] details are",i+1);
i++;
}

}
void display(struct employee s1)
{
	float hra,da,totalsalary;
	
	printf("\n empno = %d",s1.empno);
printf("\n emp name = %s",s1.name);
hra=s1.salary * .15f;
da=s1.salary * .35f;
totalsalary=hra+da+s1.salary;
	printf("\n hra = %f",hra);
		printf("\n da = %f",da);
			printf("\n total salary = %f",totalsalary);



}


