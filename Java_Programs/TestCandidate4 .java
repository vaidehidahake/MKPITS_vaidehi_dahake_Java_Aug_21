//this keyword - refers to current instance variable.
class Candidate4
{
  int rollno;
  String name;
  int age;

  public Candidate4 (int rollno,String name,int age)
  {
    this.rollno=rollno;
    this.name=name;
    this.age=age;
  }
   public void display()
   {
   System.out.println("rollno:"+rollno);
   System.out.println("name:"+name);
   System.out.println("age:"+age);
   }

}

class TestThis1
{
  public static void main(String args[])
  {
     Candidate4 c1=new Candidate4 (1,"arun",12);
     Candidate4 c2=new Candidate4 (2,"aman",15);
     c1.display();
     c2.display();
   }
}

