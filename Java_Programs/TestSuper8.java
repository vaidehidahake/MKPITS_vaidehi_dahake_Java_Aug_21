//real use of super.
class Person
{  
    int id;  
    String name;  
    Person(int id,String name)
{  
    this.id=id;  
    this.name=name;  
    }  
    }  
    class Emp extends Person
    {  
    float salary;  
    Emp(int id,String name,float salary)
    {  
    super(id,name);//reusing parent constructor  
    this.salary=salary;  
    }  
    void display()
    {
    System.out.println(id+" "+name+" "+salary);
    }  
    }  
    class TestSuper8
    {  
    public static void main(String[] args)
    {  
    Emp e1=new Emp(10,"ankita",85000f);  
    e1.display();  
    }
    }  


