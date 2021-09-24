//parameterized constructor.


class Student5
{
  int id;
  String name;
  String school;
  
   
   public Student5(int i,String n,String m)
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
     Student5 s1=new Student5(11,"prachi","modern");
     Student5 s2=new Student5(12,"simran","centerpoint");
      s1.display();
       s2.display();
     
    


   }

}

