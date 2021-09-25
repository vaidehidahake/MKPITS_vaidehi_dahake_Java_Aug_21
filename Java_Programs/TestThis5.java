// this: to invoke current class method.
class Man
{
  void m()
  {
   System.out.println("Hello m");
  }
  void n()
  {
    System.out.println("Hello n");
    this.m();
   }
   
 }
 class TestThis5
 {
   public static void main(String args[])
   {
      Man m1=new Man();
      m1.n();
      
     }
 }    
    
    