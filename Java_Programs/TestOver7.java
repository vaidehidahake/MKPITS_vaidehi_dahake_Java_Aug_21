//Method Overloading and Type Promotion.
class Over
{

   	 void add(int a,long b)
   	{

   	    System.out.println(a+b);

          }

       void add(int a,int b,int c)
          {

           System.out.println(a+b+c);
           }

}
class TestOver7
{
	public static void main(String args[])
	{
		Over o=new Over();
		o.add(11,11);
		o.add(11,11,11);


    }
}