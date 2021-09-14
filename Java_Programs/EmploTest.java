class EmployeeD
{
 int empNo;
 String empName;
 String designation;
double salary;

void insertRecord(int r,String n,String d,double s)
{
      empNo=r;
      empName=n;
      designation=d;
      salary=s;
}

void displayInformation()
{
   System.out.println(empNo+" "+empName+" "+designation+" "+salary);
}
}
class EmploTest
{
public static void main(String[] args)
{
 EmployeeD e1=new EmployeeD();
  EmployeeD e2=new EmployeeD();
   EmployeeD e3=new EmployeeD();
 e1.insertRecord(111,"ram","manager",40600);
  e2.insertRecord(112,"priya","ceo",100000);
   e3.insertRecord(113,"riya","peon",15000);
   e1.displayInformation();
   e2.displayInformation();
   e3.displayInformation();
 }
 }

