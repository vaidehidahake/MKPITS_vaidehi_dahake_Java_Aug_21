//5)ex-2 StringBuffer reverse() method
import java.util.*;
class StringBufferExample13
{
public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     System.out.println("enter city name:");
     String cn=sc.next();
     StringBuffer sb=new StringBuffer(cn);
     sb.reverse();
     System.out.println(sb);
}
}