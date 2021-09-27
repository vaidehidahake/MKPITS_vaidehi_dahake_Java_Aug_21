//aggregation
class Operation
{
   int square(int n)
   {
      return n*n;
   }

  }

  class Circle
  {
    Operation op;//aggregation.
    double pi=3.14;

  double area(int radius)
  {
         op=new Operation();
         int rsquare=op.square(radius);//code reusability.
         return pi*rsquare;
   }


 }

 class TestAgg
 {
     public static void main(String args[])
     {
        Circle c1=new Circle();
     double result=c1.area(3);
     System.out.println(result);
     }
  }
