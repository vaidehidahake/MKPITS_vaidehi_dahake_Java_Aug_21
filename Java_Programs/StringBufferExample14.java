//5)ex-3 StringBuffer reverse() method
import java.util.*;
class StringBufferExample14
{
public static void main(String args[])
{
	String str="";
	String str1="";
     Scanner sc=new Scanner(System.in);
     System.out.println("enter name:");
     String cn=sc.next();
     StringBuffer sb=new StringBuffer(cn);
     str=sb.toString();
     sb.reverse();
     str1=sb.toString();
     System.out.println("str"+str);
     System.out.println("str1"+str1);
     if(str.equals(str1))
     {
	   System.out.println("string is pallindrome");
     }
     else
     {
	   System.out.println("string is not pallindrome");
	 }
}
}