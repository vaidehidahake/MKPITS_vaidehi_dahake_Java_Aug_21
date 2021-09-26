//2-Single level Inheritance Example.
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

class TestInh2
{
public static void main(String args[])
{
   Student s1=new Student();
    s1.insertPersondata("esha","nagpur");
    s1.insertStudentdata(12,99);
    s1.displayPersondata();
    s1.displayStudentdata();
 }
 }
 
    
   
   

   
 