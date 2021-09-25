//this keyword can be used to return current class instance.
class A6
{  
    A6 getA6()
    {  
    return this;  
    }  
    void msg()
    {
    System.out.println("Hello java");
    }  
    }  
    class Test6
    {  
    public static void main(String args[])
    {  
    new A6().getA6().msg();  
    }  
    }  
