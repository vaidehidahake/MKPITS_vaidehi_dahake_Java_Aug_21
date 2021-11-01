//ex-3 Treeset
import java.util.*;
class TreeSetExample3
{
public static void main(String args[])
{
   TreeSet<String> set=new TreeSet<String>();
   set.add("Rajesh");
   set.add("Riva");
   set.add("Rishi");
   set.add("Riva");
   Iterator<String> itr=set.iterator();
   while(itr.hasNext())
   {
   System.out.println(itr.next());
   }
}
}