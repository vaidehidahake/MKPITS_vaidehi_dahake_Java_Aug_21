class Calculate
{
	 int addition(int a,int b)
	{
	   return a+b;

        }

      float addition( float a, float b)
     	{
           return a+b;

        }
        
        double addition( double a,double b, double c)
	{
	     		
	    return a+b+c;
	
        }

}

class TestOver4
{
	public static void main(String args[])
	{
	Calculate c1=new Calculate();
	int res=c1.addition(2,3);
	System.out.println("res="+res);
	float res1=c1.addition(2.1f,3.3f);
	System.out.println("res="+res1);
	double res2=c1.addition(2.1,3.3,6.9);
        System.out.println("res="+res2);



    }
}