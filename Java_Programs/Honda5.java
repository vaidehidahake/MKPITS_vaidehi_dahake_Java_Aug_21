//Runtime polymorphism can't be achieved by data members.
class Bike
{
     int speedlimit=100;
    }
    class Honda5 extends Bike
    {
     int speedlimit=150;

     public static void main(String args[])
     {
      Bike obj=new Honda3();
      System.out.println(obj.speedlimit);//100
    }
    }
