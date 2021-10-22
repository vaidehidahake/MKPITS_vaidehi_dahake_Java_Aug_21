//ex-4 exception propagation
class TestExProp2
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
   n();
   }

 public static void main(String args[])
 {
   TestExProp2 obj=new TestExProp2();
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

