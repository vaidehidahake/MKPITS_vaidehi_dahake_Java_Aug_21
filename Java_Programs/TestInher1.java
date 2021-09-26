//assignment :
//create a person class , then create a student class inherited from person class , then create a parttimestudent class inherited from student class.
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

class PartTimeStudent extends Student
{
   int hours;

   void insertPartTimeStudentdata( int hours )
   {
      this.hours=hours;

   }

   void displayPartTimeStudentdata()
   {
    System.out.println("hours ="+hours);

   }
}


class TestInher1
{
public static void main(String args[])
{
   PartTimeStudent p1=new PartTimeStudent();
   java.util.Scanner scan=new java.util.Scanner(System.in);
   System.out.println("enter person name:");
    String name=scan.next();
    System.out.println("enter person address:");
    String address=scan.next();
    p1.insertPersondata(name,address);
    System.out.println("enter roll number:");
    int rno=scan.nextInt();
    System.out.println("enter marks:");
    int marks=scan.nextInt();
    p1.insertStudentdata(rno,marks);
     System.out.println("enter parttimeemployee hours:");
    int hours=scan.nextInt();
    p1.insertPartTimeStudentdata(hours);

    p1.displayPersondata();
    p1.displayStudentdata();
    p1.displayPartTimeStudentdata();
 }
 }









