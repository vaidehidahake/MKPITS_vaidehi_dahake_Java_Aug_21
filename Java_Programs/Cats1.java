//ex-1 static binding
class Animal
{
   void eat()
   {
   System.out.println("animal is eating......");
   }
 }
 
 class Cats1 extends Animal
 {
   public static void main(String args[])
   {
      Cats1 c1=new Cats1();
      c1.eat();
   }
 }  