//9 - create a structure student with members rno,name and address , pass this structure to function display to display structure values
//display to display structure values
struct student 
{
	int rno;
	char name[20];
	char address[20];
}s1;
//creating function declaration
void display(struct student s1);
#include<stdio.h>
int main() 
{
printf("enter rno ");
scanf("%d",&s1.rno);
printf("enter student name ");
scanf("%s",&s1.name);
printf("enter address ");
fflush(stdin);
gets(s1.address);

printf("\nstudent details are");
display(s1); 
}
void display(struct student s1)
{
	printf("\n rno = %d",s1.rno);
printf("\n student name = %s",s1.name);
printf("\n address = %s",s1.address);

}

