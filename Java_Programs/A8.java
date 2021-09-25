//this: to pass as argument in the constructor call.
class B12
{
  A8 obj;
  B12(A8 obj)
  {
     this.obj=obj;
   }
   void display()
   {
   System.out.println(obj.data);
   }
 }
 class A8
 {
       int data=400;
       A8()
       {
          B12 b=new B12(this);
          b.display();
       }
       public static void main(String args[])
       {
          A8 a=new A8();
       }

   }
