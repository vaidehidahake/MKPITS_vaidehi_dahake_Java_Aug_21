//example of cube without static.
class Calculate1
{
   int cube(int n)
   {
     return n*n*n;
   }
   
  public static void main(String args[])
  {
     
   Calculate1 c1=new Calculate1();
   int result=c1.cube(3);
   System.out.println("cube is :"+result);
   }
   
}   
   
   