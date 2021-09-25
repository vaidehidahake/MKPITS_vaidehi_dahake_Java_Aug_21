//static keyword.
class Candidate2
{
  int rollno;
  String name;
  static String college="S.B.Jain";
  
  static void change()//to change college name.
  {
     college="gnit";
  }   

 public Candidate2(int r,String n)
 {
    rollno=r;
    name=n;
 }

 public void display()
 {
   System.out.println("rollno = "+rollno);
   System.out.println("name = "+name);
    System.out.println("college = "+college);

 }
 }

 class TestCandidate2
 {
 public static void main(String args[])
 {
    Candidate2.change();
    Candidate2 c1=new Candidate2(11,"priya");
    Candidate2 c2=new Candidate2(12,"vaid");
    c1.display();
    c2.display();
  }

  }



