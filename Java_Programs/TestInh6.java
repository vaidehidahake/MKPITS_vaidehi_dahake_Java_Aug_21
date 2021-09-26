//2-Multilevel inheritance example.
class Person
{
   String name;
   String address;

void insertPersondata(String name,String address)
{
   this.name=name;
   this.address=address;
}

void displayPersondata()
{
 System.out.println("name ="+name);
 System.out.println("address ="+address);
}
}
class Employee extends Person
{
   int empno;
   int salary;

   void insertEmployeedata(int empno,int salary)
   {
      this.empno=empno;
      this.salary=salary;
   }

   void displayEmployeedata()
   {
    System.out.println("empno ="+empno);
    System.out.println("salary ="+salary);
   }
}

class PartTimeEmployee extends Employee
{
   int hours;

   void insertPartTimeEmployeedata( int hours )
   {
      this.hours=hours;

   }

   void displayPartTimeEmployeedata()
   {
    System.out.println("hours ="+hours);

   }
}


class TestInh6
{
public static void main(String args[])
{
   PartTimeEmployee p1=new PartTimeEmployee();
    p1.insertPersondata("esha","nagpur");
    p1.insertEmployeedata(121,50000);
    p1.insertPartTimeEmployeedata(12);
    p1.displayPersondata();
    p1.displayEmployeedata();
    p1.displayPartTimeEmployeedata();
 }
 }








