class Students
{
      int rollno;
      String name;
}

class TaTest
{
          public static void main(String[] args)
          {
             Students s1=new Students();
             s1.rollno=13;
             s1.name="shriya";
             System.out.println("rollno="+s1.rollno);
             System.out.println("name="+""+s1.name);

          }
}