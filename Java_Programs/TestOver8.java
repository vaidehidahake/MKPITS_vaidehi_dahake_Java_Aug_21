//If there are matching type arguments in the method, type promotion is not performed.
class Over
{

   	 void add(int a,int b)
   	{

   	    System.out.println("int arg method invoked");

          }

       void add(long a,long b)
          {

           System.out.println("long arg method invoked");
           }

}
class TestOver8
{
	public static void main(String args[])
	{
		Over o=new Over();
		o.add(11,11);



    }
}