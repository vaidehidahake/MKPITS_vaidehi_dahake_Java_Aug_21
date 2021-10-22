//ex-4 exception propagation
class TestExProp4
{
  void m()
  {
  throw new java.io.IOException("device error");
  }

  void n()
  {
  m();
  }

  void p()
  {
  try
  {
   n();
   }
  catch(Exception e)
   {
      System.out.println("exception handled");
   }
   }

 public static void main(String args[])
 {
   TestExProp4 obj=new TestExProp4();

   obj.p();
  
   System.out.println("normal flow");
 }
}

