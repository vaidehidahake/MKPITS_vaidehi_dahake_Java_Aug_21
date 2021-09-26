// if we inherit one class with another two classes at a time it will give compile time error.
class A
{
    void msg()
    {
    System.out.println("Hello");
    }
    }
    class B{
    void msg()
    {
    System.out.println("Welcome");
    }
    }
    class C2 extends A,B //suppose if it were
    {
     public static void main(String args[])
     {
       C obj=new C();
       obj.msg();//Now which msg() method would be invoked?
    }
    }

