//3)ex-2 StringBuffer replace() method
import java.util.*;
class StringBufferExample7
{
public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     System.out.println("enter your name:");
     String fn=sc.next();
     StringBuffer sb=new StringBuffer(fn);
     System.out.println("enter your lastname:");
     String ln=sc.next();
     sb.replace(1,5,ln);
     System.out.println(sb);
}
}