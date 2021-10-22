//4)ex-3 StringBuffer delete() method
import java.util.*;
class StringBufferExample11
{
public static void main(String args[])
{
     Scanner sc=new Scanner(System.in);
     System.out.println("enter city name:");
     String cn=sc.next();
     StringBuffer sb=new StringBuffer(cn);
     System.out.println("enter state name:");
     String sn=sc.next();
     sb.delete(1,5);
     System.out.println(sb);
}
}