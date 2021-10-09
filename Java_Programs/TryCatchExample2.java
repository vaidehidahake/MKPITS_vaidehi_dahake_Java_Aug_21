//with trycatch block.
    public class TryCatchExample2
    {

        public static void main(String[] args)
        {
        try
        {

            int data=50/0; //may throw exception(java.lang.ArithmeticException:/ by zero).


        }
        catch(Exception ee)
        {
			System.out.println(ee);
	    }
	    System.out.println("rest of the code");

        }
    }