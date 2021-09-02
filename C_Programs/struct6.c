//11- wap to create a structure array of 3 elements of structure student
struct student 
{
	int rno;
	char name[20];
	char address[20];
};

void display(struct student s1);
#include<stdio.h>
int main() 
{
struct	student stud[3]; 
int i=0;
while(i<3 )
{
printf("\nenter rno ");
scanf("%d",&stud[i].rno);
printf("enter student name ");
scanf("%s",&stud[i].name);
printf("enter address ");
fflush(stdin);
gets(stud[i].address);
printf("\nstudent[%d] details are",i+1);
display(stud[i]); 
i++;
}

}
void display(struct student s1)
{
	printf("\n rno = %d",s1.rno);
printf("\n student name = %s",s1.name);
printf("\n address = %s",s1.address);

}

