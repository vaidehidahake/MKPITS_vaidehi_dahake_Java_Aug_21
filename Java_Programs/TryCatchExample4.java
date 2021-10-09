//we also kept the code in a try block that will not throw an exception.
public class TryCatchExample4
    {

        public static void main(String[] args)
        {
        try
        {

            int data=50/0; //may throw exception(java.lang.ArithmeticException:/ by zero).


        }
        catch(Exception e)
        {
			System.out.println(e);
	    }
	    System.out.println("rest of the code");

        }
    }