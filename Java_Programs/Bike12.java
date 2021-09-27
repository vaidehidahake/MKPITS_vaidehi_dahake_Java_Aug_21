class Vehicle
{
 void run()
 {
  System.out.println("Vehicle is running");
  }
}

class Bike12 extends Vehicle
{
  void run()
   {
    System.out.println("Bike is running");
  }
public static void main(String args[])
{
   Bike12 b=new Bike12();
   b.run();
 }
}