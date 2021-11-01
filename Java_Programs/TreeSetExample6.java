//ex-6 Treeset
import java.util.*;
class TreeSetExample6
{
public static void main(String args[])
{
   TreeSet<String> set=new TreeSet<String>();
   set.add("mi10");
   set.add("motorola");
   set.add("sony");
   set.add("lg");
   set.add("samsung");
   System.out.println("Original list:"+set);
   System.out.println("Reverse list:"+set.descendingSet());
   System.out.println("HeadSet :"+set.headSet("lg",true));
   System.out.println("SubSet:"+set.subSet("mi10",false,"samsung",true));
   System.out.println("TailSet:"+set.tailSet("sony",true));
}
}