//example of cube with static.
class Calculate2
{
   static int cube(int n)
   {
     return n*n*n;
   }
   
  public static void main(String args[])
  {
     
  Calculate2 c1=new Calculate2();
   int result=c1.cube(5);
   System.out.println("cube is :"+result);
   }
   
}   
   
   