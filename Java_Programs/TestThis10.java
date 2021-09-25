//Calling parameterized constructor from default constructor.
class Me1
{
  Me1()//default constructor
  {
    this(10);
  System.out.println("hello");
}
  Me1(int a)//parameterized constructor.
  {

     System.out.println(a);
  }

}
class TestThis10
{
  public static void main(String[] args)
  {

  Me1 m1=new Me1();
  }
}
