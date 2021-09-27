//if we dont use method overriding.
class Vehicle
{
 void run()
 {
  System.out.println("Vehicle is running");
  }
}

class Bike11 extends  Vehicle
{
public static void main(String args[])
{
   Bike11 b=new Bike11();
   b.run();
 }
}