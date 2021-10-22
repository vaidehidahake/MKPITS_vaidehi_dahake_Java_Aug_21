//2)ex-3 StringBuffer insert() method
import java.util.*;

class StringBufferExample5
{
  public static void main(String args[])
  {
  Scanner s1=new Scanner(System.in);
  System.out.println("enter your name:");
  String fn=s1.next();
     StringBuffer sb=new StringBuffer(fn);
      System.out.println("enter your lastname:");
  String ln=s1.next();
     sb.insert(5,ln);
     System.out.println(sb);
   }
 }