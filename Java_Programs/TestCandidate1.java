//static keyword.
class Candidate1
{
  int rollno;
  String name;
  static String college="S.B.Jain";

 public Candidate1(int r,String n)
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

 class TestCandidate1
 {
 public static void main(String args[])
 {
    Candidate1 c1=new Candidate1(11,"priya");
    Candidate1 c2=new Candidate1(12,"vaid");
    c1.display();
    c2.display();
  }

  }



