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
}

  class Car1 extends Vehicle
  {
    void run()
     {
      System.out.println("Car is running");
  }
}
class Honda
{
public static void main(String args[])
{
   Bike12 b=new Bike12();
   b.run();
   Car1 c=new Car1();
   c.run();

 }
}