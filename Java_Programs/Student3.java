//default values

class Student3
{
  int id;
  String name;
  String school;

 void display()
  {
    System.out.println("id = "+id);
    System.out.println("name = "+name);
    System.out.println("school = "+school);
   }

  public static void main(String args[])
  {
     Student3 s1=new Student3();
     Student3 s2=new Student3();
     s1.display();//0,null
     s2.display();//0,null


   }

}

