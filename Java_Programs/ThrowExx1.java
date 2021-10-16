//throw keyword example-In this example, we have to create the validate method that takes integer value as a parameter.
//If the age is less than 18, we are throwing the ArithmeticException otherwise print a message welcome to vote.

public class ThrowExx1
{

  static void validate(int age)throws Exception
  {
         if(age<18)
         {
          throw new Exception("not valid");
         }
         else
         {
          System.out.println("welcome to vote");
	     }
  }
       public static void main(String args[])
       {
		   try
		   {
            validate(12);

	       }
	       catch(Exception ee)
	       {
		  System.out.println(ee.toString());
	       }
          System.out.println("rest of the code...");
        }





    }
