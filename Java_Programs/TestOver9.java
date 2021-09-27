//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.
class Over
{

   	 void add(int a,long b)
   	{

   	    System.out.println("a method invoked");

          }

       void add(long a,int b)
          {

           System.out.println("b method invoked");
           }

}
class TestOver9
{
	public static void main(String args[])
	{
		Over o=new Over();
		o.add(11,11);//reference to add is ambiguous




    }
}