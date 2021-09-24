//copy constructor(copying value of obj into another).

class Student6
{
  int id;
  String name;


   public Student6(int i,String n)
     {
         id=i;
         name=n;
     }
    
     public Student6(Student6 s)
         {
             id=s.id;
             name=s.name;
         }


 void display()
  {
    System.out.println("id = "+id);
    System.out.println("name = "+name);

   }

  public static void main(String args[])
  {
    Student6 s1=new Student6(12,"simran");
    Student6 s2=new Student6(s1);
      s1.display();
       s2.display();




   }

}

