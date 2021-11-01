//ex-7 Treeset
import java.util.*;
class TreeSetExample7
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
   System.out.println("HeadSet :"+set.headSet("C"));
   System.out.println("SubSet:"+set.subSet("A","E"));
   System.out.println("TailSet:"+set.tailSet("C"));
}
}