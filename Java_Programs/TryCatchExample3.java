//with trycatch block.
//we also kept the code in a try block that will not throw an exception.
    public class TryCatchExample3
    {

        public static void main(String[] args)
        {
        try
        {

            int data=50/0; //(java.lang.ArithmeticException:/ by zero).
              System.out.println("rest of the code");
        }
        catch(ArithmeticException e)
        {
			System.out.println(e);
	    }


        }
    }