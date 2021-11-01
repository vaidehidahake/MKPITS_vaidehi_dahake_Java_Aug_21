//ex-5 Tree Map(sorted map).
import java.util.*;
class TreeMapExample5
{
public static void main(String args[])
{
NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
map.put(101,"Ajay");
map.put(103,"Kajol");
map.put(104,"Amir");
map.put(102,"Divya");
System.out.println("head map:"+map.headMap(103,true));
System.out.println("tail map:"+map.tailMap(103,true));
System.out.println("sub map:"+map.subMap(101,false,103,true));


}
}