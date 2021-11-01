//ex-4 an example to retrieve and remove the highest and lowest Value.
import java.util.*;
class TreeSetExample4
{
public static void main(String args[])
{
   TreeSet<Integer> set=new TreeSet<Integer>();
   set.add(44);
   set.add(100);
   set.add(20);
   set.add(9);
   System.out.println("Highest value:"+set.pollFirst());
   System.out.println("Highest value:"+set.pollLast());
}
}