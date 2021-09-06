//13-wap to accept salary of 10 persons using while loop and print totalsalary and average salary.
#include<stdio.h>
int main() {
int per=1,salary,totalsal;
float averagesal;
while(per<=10)
{
	printf("\n%d",per);
		per++;
printf("\nenter salary");
scanf("%d",&salary);
	totalsal=totalsal+salary;
}
averagesal=(float)totalsal/10.0f;
printf("average salary of 10 people = %f",averagesal);
}

