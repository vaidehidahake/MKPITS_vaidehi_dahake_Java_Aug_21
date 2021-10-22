//ex-3 Sort ArrayList.
import java.util.*;
class ArrayListExample11
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
  
  List<Integer>num=new ArrayList<Integer>();
   num.add(1);
   num.add(459);
   num.add(100);
   num.add(345);
   Collections.sort(num);
  for(Integer number:num)
  {
  System.out.println(number);
  }
 }
}