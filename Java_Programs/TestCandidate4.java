//Real usage of this() constructor call.
//this keyword - refers to current instance variable.
class Candidate4
{
  int rollno;
  String name;
  int age;
  int fees;

  Candidate4(int rollno,String name,int age)
  {
    this.rollno=rollno;
    this.name=name;
    this.age=age;
  }
  
  Candidate4(int rollno,String name,int age,int fees)
    {
      this(rollno,name,age);//reuse of constructor.
      this.fees=fees;
  }
  
  void display()
   {
   System.out.println("rollno:"+rollno);
   System.out.println("name:"+name);
   System.out.println("age:"+age);
   System.out.println("fees:"+fees);
   }

}

class TestCandidate4
{
  public static void main(String args[])
  {
     Candidate4 c1=new Candidate4(1,"arun",12);
     Candidate4 c2=new Candidate4(2,"aman",15,12000);
     c1.display();
     c2.display();
   }
}

