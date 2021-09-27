//2)- Method Overloading: changing data type of arguments.
class Adder
{
	static int add(int a,int b)
	{
		return a+b;

        }

     static double add(double a,double b,double c)
     	{
     		return a+b+c;

        }

}

class TestOver3
{
	public static void main(String args[])
	{
		System.out.println(Adder.add(11,12));
		System.out.println(Adder.add(1.1,1.2,1.3));
    }
}