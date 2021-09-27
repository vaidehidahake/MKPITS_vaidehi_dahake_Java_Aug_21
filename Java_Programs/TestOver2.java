class Calculate
{
	 int addition(int a,int b)
	{
		return a+b;

        }

      int addition(int a,int b,int c)
     	{
     		return a+b+c;

        }

}

class TestOver2
{
	public static void main(String args[])
	{
	Calculate c1=new Calculate();
	int res=c1.addition(2,3);
	System.out.println("res="+res);
	res=c1.addition(2,3,5);
	System.out.println("res="+res);


    }
}