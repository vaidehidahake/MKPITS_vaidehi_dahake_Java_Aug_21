//parameterized constructor.


class Student4
{
  int id;
  String name;
  String school;
  
  public Student4()
  {
      id=10;
      name="riya";
      school="modern";
   }
   
   public Student4(int i,String n,String m)
     {
         id=i;
         name=n;
         school=m;
      }
   

 void display()
  {
    System.out.println("id = "+id);
    System.out.println("name = "+name);
    System.out.println("school = "+school);
   }

}

class TestStudent4
{
  public static void main(String args[])
  {
     Student4 s=new Student4();//default constructor
     s.display();
     
     Student4 s1=new Student4(11,"prachi","modern");//parameterized constructor.
     s1.display();


   }

}

