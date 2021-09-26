//3-Single level Inheritance Example.
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

class TestInh3
{
public static void main(String args[])
{
   Employee s1=new Employee();
    s1.insertPersondata("esha","nagpur");
    s1.insertEmployeedata(121,50000);
    s1.displayPersondata();
    s1.displayEmployeedata();
 }
 }






