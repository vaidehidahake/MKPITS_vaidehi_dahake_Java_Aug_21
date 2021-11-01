//ex-1 Tree Map.
import java.util.*;
class TreeMapExample1
{
public static void main(String args[])
{
TreeMap<Integer,String> map=new TreeMap<Integer,String>();
map.put(111,"Ajay");
map.put(45,"Kajol");
map.put(102,"Amir");
map.put(108,"Divya");
for(Map.Entry m:map.entrySet())
{
  System.out.println("Key is:"+m.getKey());
  System.out.println("value is:"+m.getValue());
}
}
}