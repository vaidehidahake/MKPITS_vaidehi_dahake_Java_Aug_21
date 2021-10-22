//ex-5 exception propagation
class TestExProp5
{
  void m()
  {
  try
  {
  throw new java.io.IOException("device error");
  }
  
  catch(Exception ee)
     {
        System.out.println(ee);
   }
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
   TestExProp5 obj=new TestExProp5();

   obj.p();
  
   System.out.println("normal flow");
 }
}

