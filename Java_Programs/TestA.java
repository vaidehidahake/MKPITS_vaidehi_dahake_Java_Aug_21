class A
{
  private int data=60;
  private void msg()
  {
	  System.out.println("Hello Java");
  }


}

class TestA
{
  public static void main(String args[])
  {
      A obj=new A();
      System.out.println(obj.data);//data has private access in A.
      obj.msg();//msg() has private access in A.
   }
}