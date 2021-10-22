//ex-4 exception propagation
class TestExProp3
{
  void m()
  {
  try
  {
    int data=70/0;
  }
  catch(Exception e)
  {
  System.out.println("exception handled in m");
  }
  }

  void n()
  {
  m();
  }

  void p()
  {
   n();
   }

 public static void main(String args[])
 {
   TestExProp3 obj=new TestExProp3();
   try
   {
   obj.p();
   }
   catch(Exception e)
   {
   System.out.println("exception handled");
   }
   System.out.println("normal flow");
 }
}

