class Bike
{
  private int speed;

  Bike()
  {
    System.out.println("Bike is created");
    speed=100;
  }

  private void display()
  {
     System.out.println("speed of bike is ="+speed);
  }

}

class TestBike
{
  public static void main(String args[])
  {
      Bike b=new Bike();
      speed=20;//error since speed is already declared in private.
      b.display();//error since display is also declared in private.
   }
}