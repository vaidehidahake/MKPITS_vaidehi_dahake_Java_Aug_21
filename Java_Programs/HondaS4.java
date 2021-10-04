//Example-3 of Abstract class that has an abstract method.
abstract class Bike
{
 abstract void run();
}

class HondaS4 extends Bike
{
   void run()
   {
   System.out.println("running safetly....");
   }
 public static void main(String args[])
 {
    Bike obj=new HondaS4();
    obj.run();
 }
} 