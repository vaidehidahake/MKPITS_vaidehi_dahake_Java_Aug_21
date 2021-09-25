//this keyword - refers to current instance variable.
class Candidate3
{
  int rollno;
  String name;
  int age;

  public Candidate3(int rollno,String name,int age)
  {
    rollno=rollno;
    name=name;
    age=age;
  }
   public void display()
   {
   System.out.println("rollno:"+rollno);
   System.out.println("name:"+name);
   System.out.println("age:"+age);
   }

}

class TestCandidate3
{
  public static void main(String args[])
  {
     Candidate3 c1=new Candidate3(1,"arun",12);//0,null
     Candidate3 c2=new Candidate3(2,"aman",15);//0,null
     c1.display();
     c2.display();
   }
}

