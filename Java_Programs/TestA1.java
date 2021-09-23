class A1
{

  private A1(){};
  private void msg()
  {
	  System.out.println("Hello Java");
  }


}

class TestA1
{
  public static void main(String args[])
  {
      A1 obj=new A1();//A1() has private access in A1.

   }
}