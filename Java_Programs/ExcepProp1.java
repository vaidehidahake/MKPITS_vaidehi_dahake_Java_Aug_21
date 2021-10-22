//ex-1 exception propagation
class Cal1
{
  int divide(int n1,int n2)
  {
     int res=n1/n2;
     return res;
  }
}
class Cal2 extends Cal1
{
  int res=0;
  int caldivide(int n1,int n2)
  {
  try
  {
      res=divide(n1,n2);
      return res;
  }
  catch(Exception ee)
  {
  System.out.println(ee.toString());
  }
  return res;
 }
 }

 class ExcepProp1
 {
 public static void main(String args[])
 {
   Cal2 c=new Cal2();
   int r=c.divide(4,0);
    System.out.println(r);
    System.out.println("reached till end");
  }
}


