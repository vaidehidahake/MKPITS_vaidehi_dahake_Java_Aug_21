class Employees2
{
    float salary=50000;
 }

 class Programmer extends Employees2
 {
     int bonus=1500;
 }

 class Inh1
 {
     public static void main(String args[])
     {
        Programmer p=new Programmer();
        System.out.println(" salary of employee is :"+p.salary);
         System.out.println(" bonus of Programmer is :"+p.bonus);
      }
  }
