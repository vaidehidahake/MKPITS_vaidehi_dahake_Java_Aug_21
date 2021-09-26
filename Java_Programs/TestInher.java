//3-Multilevel inheritance example.
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


class TestInher
{
public static void main(String args[])
{
   PartTimeEmployee p1=new PartTimeEmployee();
   java.util.Scanner scan=new java.util.Scanner(System.in);
   System.out.println("enter person name:");
    String name=scan.next();
    System.out.println("enter person address:");
    String address=scan.next();
    p1.insertPersondata(name,address);
    System.out.println("enter employee number:");
    int empno=scan.nextInt();
    System.out.println("enter employee salary:");
    int salary=scan.nextInt();
    p1.insertEmployeedata(empno,salary);
     System.out.println("enter parttimeemployee hours:");
    int hours=scan.nextInt();
    p1.insertPartTimeEmployeedata(hours);

    p1.displayPersondata();
    p1.displayEmployeedata();
    p1.displayPartTimeEmployeedata();
 }
 }








