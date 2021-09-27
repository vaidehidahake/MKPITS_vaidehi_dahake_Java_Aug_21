//super can be used to invoke parent class method.
class employee 
{
	String empname="ramesh";
	void display() 
	{
		System.out.println("employee name is " + empname);
	}
}
class parttimeemployee extends employee 
{
	String empname="amrit";
	void display() 
	{
		super.display();
		System.out.println("parttime emp name is " + empname); //amrit

	}

}

    class TestSuper4
    {
    public static void main(String args[])
    {
		parttimeemployee p1=new parttimeemployee();
		p1.display();

    }
    }
