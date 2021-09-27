//Why Method Overloading is not possible by changing the return type of method only?
class Adder
{
	static int add(int a,int b)
	{
		return a+b;

        }

     static double add(int a,int b)
     	{
     		return a+b;

        }

}

class TestOver5
{
	public static void main(String args[])
	{
		System.out.println(Adder.add(11,12));//method add(int,int) is already defined in class Adder.

    }
}