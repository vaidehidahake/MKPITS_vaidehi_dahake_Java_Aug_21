class Animal
{
 void eat()
 {
   System.out.println("animal is eating......");
 }
}

class Dog extends Animal
{
  void eat()
  {
    System.out.println("dog is eating......");
  }
}

class BabyDog1S extends Dog
{
  public static void main(String args[])
  {
   Animal a=new BabyDog1S();
   a.eat();
  }
}  
   