//Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'.
//The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat

class Employee
{
  String name;
  int yearofjoining;
  int salary;
  String address;

  Employee(String name,int yearofjoining,int salary, String address)
  {
   this.name=name;
   this.yearofjoining=yearofjoining;
   this.salary=salary;
   this.address=address;
   }
   void display()
   {
   System.out.println("name="+name);
   System.out.println("year of joining="+yearofjoining);
   System.out.println("salary="+salary);
   System.out.println("address="+address);
   }
 }

 class TestEmpAs
 {
 public static void main(String args[])
 {
   Employee e1=new Employee("Robert",1994,50000," 64C- WallsStreat");
   e1.display();
   Employee e2=new Employee("Sam",2000,60000,"68D- WallsStreat");
   e2.display();
   Employee e3=new Employee("John",1999,80000,"26B- WallsStreat");
   e3.display();
  }
  }



