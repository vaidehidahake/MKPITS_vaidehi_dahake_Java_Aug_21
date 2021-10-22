//ex-3 exception propagation
class TestExProp1
{
  void m()
  {
    int data=70/0;
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
   TestExProp1 obj=new TestExProp1();
   obj.p();
   System.out.println("normal flow");
 }
}

