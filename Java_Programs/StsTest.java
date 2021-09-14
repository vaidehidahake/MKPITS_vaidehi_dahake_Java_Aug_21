class Students
{
      int rollno;
      String name;
}

class StsTest
{
          public static void main(String[] args)
          {
             Students s1=new Students();
             s1.rollno=13;
             s1.name="shriya";
             System.out.println("rollno="+s1.rollno);
             System.out.println("name="+""+s1.name);
             Students s2=new Students();
	                  s2.rollno=11;
	                  s2.name="sham";
	                  System.out.println("rollno="+""+s2.rollno);//space
             System.out.println("name="+s2.name);
          }
}