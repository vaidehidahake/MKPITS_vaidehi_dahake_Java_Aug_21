//ex-1 Treeset
import java.util.*;
class TreeSetExample1
{
public static void main(String args[])
{
   TreeSet<String> set=new TreeSet<String>();
   set.add("Rajesh");
   set.add("Riva");
   set.add("Rishi");
   set.add("Priya");
   Iterator<String> itr=set.iterator();
   while(itr.hasNext())
   {
   System.out.println(itr.next());
   }
}
}