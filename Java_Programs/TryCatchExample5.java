//an example to print a custom message on exception.
public class TryCatchExample5
    {

        public static void main(String[] args)
        {
        try
        {

            int data=50/0; //may throw exception(java.lang.ArithmeticException:/ by zero).


        }
        catch(Exception e)
        {
			System.out.println("can't  divided by 0");
	    }


        }
    }