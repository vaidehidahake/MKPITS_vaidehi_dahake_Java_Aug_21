//inheritance example:create a parent class person having fields name and address then create a inherited class student having new fields rno and marks.
class Person
{
    String name;
    String address;
 }
  class Student extends Person
 {
      int rno;
      int marks;
 }

 class TestPerson
 {
   public static void main(String args[])
   {
      Student s=new Student();
      s.rno=12;
      s.name="riya";
      s.address="nagpur";
      s.marks=99;

      System.out.println("rno is :"+s.rno);
      System.out.println("name is :"+s.name);
      System.out.println("address is :"+s.address);
      System.out.println("marks is :"+s.marks);
    }
 }