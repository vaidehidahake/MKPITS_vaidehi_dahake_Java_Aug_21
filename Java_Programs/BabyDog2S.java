//ex-1 dynamic binding
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

class BabyDog2S extends Dog
{
  public static void main(String args[])
  {
   Animal a=new BabyDog2S();
   a.eat();
  }
}  
   