    class A11
    {  
    void m()
    {  
    System.out.println(this);//prints same reference ID  
    }  
    public static void main(String args[])
    {  
    A11 obj=new A11();  
    System.out.println(obj);//prints the reference ID  
    obj.m();  
    }  
    }  
