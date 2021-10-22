//ex-1 Sort ArrayList.
import java.util.*;
class ArrayListExample9
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
   list.add("Watch");
   list.add("Purse");
   list.add("Jewellary");
   list.add("Spectacles");
   Collections.sort(list);
  for(String things:list)
  {
  System.out.println(things);
  }
 }
}