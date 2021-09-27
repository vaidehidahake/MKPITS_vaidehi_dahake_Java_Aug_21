//assignment-Employee has an object of Address, address object contains its own informations such as city, state, country etc by accepting values from user.
import java.util.*;
class Address
{
   String city;
   String state;
   String country;

  Address(String city,String state,String country)
  {
      this.city=city;
      this.state=state;
      this.country=country;
   }


}

class Employee
{
  int id;
  String name;
  Address address;//aggregate.

  Employee(int id,String name,Address address)
  {
	  this.id=id;
	  this.name=name;
     this.address=address;
  }

  void display()
  {
    System.out.println("id="+id);
    System.out.println("name="+name);
     System.out.println("city="+address.city);
     System.out.println("state="+address.state);
     System.out.println("country="+address.country);
   }
 }
 class TestAggre1
 {
   public static void main(String args[])
   {

      Scanner scan=new Scanner(System.in);



              System.out.println("enter id:");
              int id=scan.nextInt();
               System.out.println("enter name:");
              String name=scan.next();
              System.out.println("enter city:");
			  String city=scan.next();
			  System.out.println("enter state:");
			  String state=scan.next();
			  System.out.println("enter country:");
              String country=scan.next();



              Address adr1=new Address(city,state,country);
              Employee e1=new Employee(id,name,adr1);
              e1.display();









    }
 }






