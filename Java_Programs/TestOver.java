//overloading method- changing no. of arguments.
class Calculate
{
	void add(int n1,int n2)
	{
		int res= n1+n2;
	    System.out.println("res="+res);
     }

     void add(int n1,int n2,int n3)//overloading.
	 	{
	 		int res= n1+n2+n3;
	 	    System.out.println("res="+res);
     }
}

class TestOver
{
	public static void main(String args[])
	{
		Calculate c1=new Calculate();
		c1.add(4,5);
		c1.add(5,6,7);
    }
}

