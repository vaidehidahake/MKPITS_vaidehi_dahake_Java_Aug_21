class employee
{
	String empname="ram";
}
class parttimeemployee extends employee
{
	String empname="amisha";
	void display()
	{
		System.out.println("parttime emp name is " + empname); //amisha
		System.out.println("employee name is " + super.empname); // ram
	}

}

    class TestSuper3
    {
    public static void main(String args[])
    {
		parttimeemployee p1=new parttimeemployee();
		p1.display();

    }
    }
