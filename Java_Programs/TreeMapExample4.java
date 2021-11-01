//ex-4 create a hashmap collection to store year and album name.
import java.util.*;
class TreeMapExample4
{
public static void main(String args[])
{
NavigableMap<Integer,String> map=new TreeMap<Integer,String>();
map.put(2015,"Silsilay");
map.put(2005,"Aaina");
map.put(2000,"Masum");

System.out.println("descending map:"+map.descendingMap());
System.out.println("head map:"+map.headMap(2005,true));
System.out.println("tail map:"+map.tailMap(2005,true));
System.out.println("sub map:"+map.subMap(2000,false,2015,true));


}
}