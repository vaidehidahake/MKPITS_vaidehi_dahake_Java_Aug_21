class Stud
{
 int rollno;
 String name;

 void insert(int r,String n)
 {
     rollno=r;
     name=n;
 }

 void displayInformation()
  {
   System.out.println(rollno+" "+name);

 }

}

class StuDet
  {
  public static void main(String[] args)
  {
     Stud s1=new Stud();
     s1.insert(24,"ram");
     Stud s2=new Stud();
     s2.insert(10,"priya");
     s1.displayInformation();
     s2.displayInformation();
   }
   }



