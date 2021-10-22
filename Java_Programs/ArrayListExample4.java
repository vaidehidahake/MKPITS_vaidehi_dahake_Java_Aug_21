//ex-2 Iterating ArrayList using Iterator.
import java.util.*;
class ArrayListExample4
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
  list.add("Mango");
  list.add("Orange");
  list.add("Banana");
  list.add("Grapes");
  Iterator itr=list.iterator();
  while(itr.hasNext())
  {
  System.out.println(itr.next());
  }
 }
}