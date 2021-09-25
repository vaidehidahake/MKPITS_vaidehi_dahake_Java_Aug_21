//this: to pass as an argument in the method.
class Mcg
{
  void m(Mcg obj)
  {
    System.out.println("method is invoked");
  }
  void p()
  {
    m(this);
  }
  public static void main(String args[])
  {
      Mcg m2=new Mcg();
      m2.p();
   }
}   