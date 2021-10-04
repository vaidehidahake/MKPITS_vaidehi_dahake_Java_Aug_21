//Java Console Example.
import java.io.Console;
class ReadString
{
   public static void main(String args[])
   {
     Console c=System.console();
     System.out.println("enter your name :");
     String n=c.readLine();
     System.out.println("Welcome"+n);
    }
 }   