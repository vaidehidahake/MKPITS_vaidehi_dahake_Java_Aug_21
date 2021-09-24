// using constructor and display method.
class Teacher
{
     int tid;
     String tname;
     
     public Teacher()
     {
         tid=121;
         tname="ritu";
      }
      
   public void display()
   {
       System.out.println("tid = "+tid);
       System.out.println("tname = "+tname);
   }
   
}

class TestTeacher
{
  public static void main(String args[])
  {
     Teacher t1=new Teacher();
     t1.display();
   }
   
}   
      
   
       
         
