//ex-1 Iterating ArrayList using For-each loop.
import java.util.*;
class ArrayListExample5
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
  list.add("Mango");
  list.add("Orange");
  list.add("Banana");
  list.add("Grapes");
  for(String fruits:list)
  {
  System.out.println(fruits);
  }
 }
}