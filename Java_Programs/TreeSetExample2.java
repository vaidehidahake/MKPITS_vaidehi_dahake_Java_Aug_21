//ex-2 Treeset
import java.util.*;
class TreeSetExample2
{
public static void main(String args[])
{
   TreeSet<String> set=new TreeSet<String>();
   set.add("Rajesh");
   set.add("Riva");
   set.add("Rishi");
   set.add("Priya");
   Iterator itr=set.descendingIterator();
   while(itr.hasNext())
   {
   System.out.println(itr.next());
   }
}
}