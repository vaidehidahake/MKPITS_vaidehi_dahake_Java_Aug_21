//4)ex-2 StringBuffer delete() method
import java.util.*;
class StringBufferExample10
{
public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     System.out.println("enter city name:");
     String cn=sc.next();
     StringBuffer sb=new StringBuffer(cn);
     sb.delete(0,2);
     System.out.println(sb);
}
}