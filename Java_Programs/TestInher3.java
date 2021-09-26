//2-Hierarchical Inheritance Example.
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
 class Student extends Person
 {
      int rno;
      int marks;


   void insertStudentdata(int rno,int marks)
   {
      this.rno=rno;
      this.marks=marks;
   }

   void displayStudentdata()
   {
    System.out.println("rno ="+rno);
    System.out.println("marks ="+marks);
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


class TestInher3
{
public static void main(String args[])
{
	System.out.println("------ Employee Details-----");
   Employee p1=new Employee();
   java.util.Scanner scan=new java.util.Scanner(System.in);
    System.out.println("enter employee number:");
    int empno=scan.nextInt();
    System.out.println("enter employee salary:");
    int salary=scan.nextInt();
    p1.insertEmployeedata(empno,salary);
    System.out.println("enter person name:");
	    String name=scan.next();
	    System.out.println("enter person address:");
	    String address=scan.next();
    p1.insertPersondata(name,address);
    p1.displayEmployeedata();
    p1.displayPersondata();

    System.out.println("------ Student Details-----");
    Student s1=new Student();

    System.out.println("enter roll number:");
	    int rno=scan.nextInt();
	    System.out.println("enter marks:");
	    int marks=scan.nextInt();
    s1.insertStudentdata(rno,marks);
     System.out.println("enter person name:");
		    String sname=scan.next();
		    System.out.println("enter person address:");
		    String saddress=scan.next();
    s1.insertPersondata(name,address);
    s1.displayStudentdata();
     s1.displayPersondata();


 }
 }









