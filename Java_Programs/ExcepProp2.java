//ex-2 exception propagation
class Cal1
{
  int mult(int n1,int n2)
  {
     int res=n1*n2;
     return res;
  }
}
class Cal2 extends Cal1
{
  int res=0;
  int calmult(int n1,int n2)
  {
  try
  {
      res=mult(n1,n2);
      return res;
  }
  catch(Exception ee)
  {
  System.out.println(ee.toString());
  }
  return res;
 }
 }

 class ExcepProp2
 {
 public static void main(String args[])
 {
   Cal2 c=new Cal2();
   int r=c.mult(4,2);
    System.out.println(r);
    System.out.println("reached till end");
  }
}


