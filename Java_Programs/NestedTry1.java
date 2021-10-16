//nested try example-example of java nested try block.
class NestedTry1
{
public static void main(String args[])
{
   try
   {
     try
     {
        int data=40/0;
        System.out.println(data);
      }
      catch(ArithmeticException e)
      {
      System.out.println(e);
      }

      try
      {
        int arr[]=new int[8];
        arr[9]=70;
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
       System.out.println(e);
       }


       }



       catch(Exception e)
       {
       System.out.println("handled");
       }
       System.out.println("normal flow");

   }

}



