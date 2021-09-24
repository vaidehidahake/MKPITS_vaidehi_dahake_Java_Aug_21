class Em
{
  int empid;

  void insert(int e)
  {
     empid=e;
  }
}

class TestEm
{
  public static void main(String args[])
 {
    Em e1=new Em();
    e1.insert(900);
  }
}