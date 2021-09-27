//Employee has an object of Address, address object contains its own informations such as city, state, country etc.
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
 class TestAggre
 {
   public static void main(String args[])
   {
       Address address1=new Address("sgd","up","india");
       Address address2=new Address("sgg","mp","india");
       Employee e1=new Employee(11,"priya",address1);
        Employee e2=new Employee(12,"ram",address2);
        e1.display();
        e2.display();
    }
 }






