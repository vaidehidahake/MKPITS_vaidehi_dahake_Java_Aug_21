//accepting from user.
import java.util.*;
class Address
{
	String city;
	String state ;
	String country;
	Address(String city,String state, String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Customer
{
	String custname;
	Address address;
	Customer(String custname, Address address)
	{
		this.custname=custname;
		this.address=address;
	}
	void display()
	{
		System.out.println("custname is " + custname);
		System.out.println("city is " + address.city);
		System.out.println("state is " + address.state);
		System.out.println("country is " + address.country);
	}
}

class TestAggre3
{
	public static void main(String[] arg)
	{
	        Scanner scan =new Scanner(System.in);
	        
	       
	        System.out.println("enter custname:");
		String custname=scan.next();
		System.out.println("enter city:");
                String city=scan.next();
	        System.out.println("enter state:");
	         String state=scan.next();
	      System.out.println("enter country:");
              String country=scan.next();
 		Address adr1=new Address(city,state,country);
		Customer cust1=new Customer(custname,adr1);
		cust1.display();

	}

}
