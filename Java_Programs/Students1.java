//overloading constructor.

class Students1
{
  int id;
  String name;



   public Students1(int i)
     {
         id=i;

      }

   public Students1(int i,String n)
     {
         id=i;
         name=n;


      }


 void display()
  {
    System.out.println("id = "+id);
    System.out.println("name = "+name);

   }

  public static void main(String args[])
  {
    Students1 s1=new Students1(11);
    Students1 s2=new Students1(12,"simran");
      s1.display();
       s2.display();




   }

}

