//this: to pass as argument in the constructor call.
class B11
{
  A5 obj;
  B11(A5 obj)
  {
     this.obj=obj;
   }
   void display()
   {
   System.out.println(obj.data);
   }
 }
 class A5
 {
       int data=100;
       A5()
       {
          B11 b=new B11(this);
          b.display();
       }
       public static void main(String args[])
       {
          A5 a=new A5();
       }
       
   }    
       