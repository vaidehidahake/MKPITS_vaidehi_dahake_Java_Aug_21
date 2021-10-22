//ex-2 Get and Set ArrayList.
import java.util.*;
class ArrayListExample8
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
   list.add("Watch");
   list.add("Purse");
   list.add("Jewellary");
   list.add("Spectacles");
   System.out.println("returning element: "+list.get(3));
   list.set(3,"Mirror");
  for(String things:list)
  {
  System.out.println(things);
  }
 }
}