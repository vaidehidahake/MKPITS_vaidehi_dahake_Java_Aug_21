class StudentOut
{
      int rollno;
      String name;
}

class Sts
{
          public static void main(String[] args)
          {
             StudentOut s1=new StudentOut();
             s1.rollno=13;
             s1.name="shriya";
             System.out.println("rollno="+s1.rollno);
             System.out.println("name="+s1.name);
          }
}