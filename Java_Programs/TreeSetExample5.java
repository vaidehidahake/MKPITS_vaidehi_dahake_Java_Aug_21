//ex-5 Treeset
import java.util.*;
class TreeSetExample5
{
public static void main(String args[])
{
   TreeSet<String> set=new TreeSet<String>();
   set.add("A");
   set.add("B");
   set.add("C");
   set.add("D");
   set.add("E");
   System.out.println("Original list:"+set);
   System.out.println("Reverse list:"+set.descendingSet());
   System.out.println("HeadSet :"+set.headSet("C",true));
   System.out.println("SubSet:"+set.subSet("A",false,"E",true));
   System.out.println("TailSet:"+set.tailSet("C",false));
}
}