//create a class employee having empno,empname,designation and salary.
class Employee
{
 int empNo;
 String empName;
 String designation;
double salary;
}
  
class EmpTest
{
public static void main(String[] args)
{
 Employee e1=new Employee();
 e1.empNo=111;
 e1.empName="ram";
 e1.designation="manager";
 e1.salary=30000;
 System.out.println("id of emp="+e1.empNo);
  System.out.println("name of emp="+e1.empName);
   System.out.println("designation of emp="+e1.designation);
 System.out.println("salary of emp="+e1.salary);
 }
 }
 

 