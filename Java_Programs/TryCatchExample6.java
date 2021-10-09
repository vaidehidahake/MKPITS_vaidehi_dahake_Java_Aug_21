//an example to resolve the exception in a catch block.
public class TryCatchExample6
    {

        public static void main(String[] args)
        {
         int i=50;
         int j=0;
        try
        {

             int res=i/j;


        }
        catch(Exception e)
        {
			System.out.println(i/(j+2));
	    }


        }
    }