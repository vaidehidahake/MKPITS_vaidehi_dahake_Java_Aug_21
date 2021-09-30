//Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds 10 to salary of the employee if it is less than 500.
//3 - 'AddWork()' which adds 5 to salary of employee if the number of hours of work per day is more than 6 hours.
class Employee
{
  int salary;
  int hours;
  int finalsalary;
   void getInfo(int salary,int hours)
  {
    this.salary=salary;
    this.hours=hours;
   }
  void Addsal()
   {
   if(salary<500)
   {
    finalsalary=salary+10;
    System.out.println("final salary is :"+finalsalary);
   }
   else
   {
   System.out.println("salary must be less than 500");
   }
   }

   void AddWork()
   {
   if(hours>6)
   {
   finalsalary=salary+5;
   System.out.println("final salary is :"+finalsalary);
   }
   else
   {
    System.out.println("hours must be more than 6");
    }
    }
 }

class TestEmpAssr1
{
public static void main(String args[])
{
  Employee e1=new Employee();
  e1.getInfo(400,10);
  e1.Addsal();
  e1. AddWork();
 }
}

