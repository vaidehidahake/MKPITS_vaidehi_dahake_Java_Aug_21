class A
{

  protected void msg()
  {
	  System.out.println("Hello Java");
  }


}

 public class Testin extends A
{
  void msg(){System.out.println("Hello java");}//msg() in Testin cannot override msg() in A.
       public static void main(String args[])
       {
         Testin obj=new Testin();
         obj.msg();
         }
      }
