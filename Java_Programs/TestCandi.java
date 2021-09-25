//Call to this() must be the first statement in constructor.
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
	  this.fees=fees;
      this(rollno,name,age);//compile time error(call to this must be first statement in constructor).

  }

  void display()
   {
   System.out.println("rollno:"+rollno);
   System.out.println("name:"+name);
   System.out.println("age:"+age);
   System.out.println("fees:"+fees);
   }

}

class TestCandi
{
  public static void main(String args[])
  {
     Candidate4 c1=new Candidate4(1,"arun",12);
     Candidate4 c2=new Candidate4(2,"aman",15,12000);
     c1.display();
     c2.display();
   }
}

