//counter by static variable without static.
class Counter1
{
  int count=0;

  Counter1()
  {
    count++;
    System.out.println("count is :"+count);
   }

   public static void main(String args[])
   {
      Counter1 c1=new Counter1();
      Counter1 c2=new Counter1();
      Counter1 c3=new Counter1();
    }


   }
