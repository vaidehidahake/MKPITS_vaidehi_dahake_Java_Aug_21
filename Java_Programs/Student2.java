//overloading constructor.


class Student2
{
  int id;
  String name;
  String school;


   public Student2(int i)
     {
         id=i;

      }

   public Student2(int i,String n,String m)
     {
         id=i;
         name=n;
         school=m;

      }


 void display()
  {
    System.out.println("id = "+id);
    System.out.println("name = "+name);
    System.out.println("school = "+school);
   }

  public static void main(String args[])
  {
     Student2 s1=new Student2(11);
     Student2 s2=new Student2(12,"simran","centerpoint");
      s1.display();
       s2.display();




   }

}

