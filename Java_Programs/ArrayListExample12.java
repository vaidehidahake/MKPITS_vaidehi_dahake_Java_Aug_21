//ex-4 Sort ArrayList.
import java.util.*;
class ArrayListExample12
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