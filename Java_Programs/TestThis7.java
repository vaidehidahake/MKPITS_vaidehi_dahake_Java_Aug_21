//this() : to invoke current class constructor.
class Me
{
  Me()
  {
  System.out.println("hello");
}
  Me(int a)
  {
     this();
     System.out.println(a);
  }

}
class TestThis7
{
  public static void main(String[] args)
  {

  Me m1=new Me(10);
  }
}
