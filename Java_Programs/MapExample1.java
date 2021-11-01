//ex-1 Map Interface(Non-Generic(Old Style)).
import java.util.*;
class MapExample1
{
public static void main(String args[])
{
Map map=new HashMap();
map.put(7,"Rajat");
map.put(2,"Abhilasha");
map.put(1,"Darshan");
map.put(9,"Riya");
Set set=map.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext())
{
  Map.Entry entry=(Map.Entry)itr.next();
  System.out.println("Key is:"+entry.getKey());
  System.out.println("value is:"+entry.getValue());
}
}
}