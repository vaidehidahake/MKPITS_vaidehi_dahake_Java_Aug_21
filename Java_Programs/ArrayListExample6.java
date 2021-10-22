//ex-2 Iterating ArrayList using For-each loop.
import java.util.*;
class ArrayListExample6
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
   list.add("Ramesh");
   list.add("Esha");
   list.add("John");
   list.add("Jonita");
  for(String name:list)
  {
  System.out.println(name);
  }
 }
}