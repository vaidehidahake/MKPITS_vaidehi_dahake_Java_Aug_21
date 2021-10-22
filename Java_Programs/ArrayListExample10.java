//ex-2 Sort ArrayList.
import java.util.*;
class ArrayListExample10
{
public static void main(String args[])
{
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