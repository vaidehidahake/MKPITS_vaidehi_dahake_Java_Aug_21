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

class TestAggre2
{
	public static void main(String[] arg)
	{
		Address adr1=new Address("nagpur","maharashtra","india");
		Customer cust1=new Customer("aditya",adr1);
		cust1.display();

	}

}
