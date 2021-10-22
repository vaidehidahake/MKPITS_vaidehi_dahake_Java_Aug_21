//ex-1 Iterating ArrayList using Iterator.
import java.util.*;
class ArrayListExample3
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
  list.add("Ramesh");
  list.add("Esha");
  list.add("John");
  list.add("Jonita");
  Iterator itr=list.iterator();
  while(itr.hasNext())
  {
  System.out.println(itr.next());
  }
 }
}