class Employees
{
 int empNo;
 String empName;
 String designation;
double salary;

public static void main(String[] args)
{
 Employees e1=new Employees();
 e1.empNo=111;
 e1.empName="ram";
 e1.designation="manager";
 e1.salary=30000;
 System.out.println("id of emp="+e1.empNo);
  System.out.println("name of emp="+e1.empName);
   System.out.println("designation of emp="+e1.designation);
 System.out.println("salary of emp="+e1.salary);
  Employees e2=new Employees();
  e2.empNo=112;
  e2.empName="priya";
  e2.designation="ceo";
  e2.salary=100000;
  System.out.println("id of emp="+e2.empNo);
   System.out.println("name of emp="+e2.empName);
    System.out.println("designation of emp="+e2.designation);
 System.out.println("salary of emp="+e2.salary);
 }
}

