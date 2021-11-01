//ex-2 Map Interface: Generic (New Style).
import java.util.*;
class MapExample2
{
public static void main(String args[])
{
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(7,"Rajat");
map.put(2,"Abhilasha");
map.put(1,"Darshan");
map.put(9,"Riya");
for(Map.Entry m:map.entrySet())
{
  System.out.println("Key is:"+m.getKey());
  System.out.println("value is:"+m.getValue());
}
}
}