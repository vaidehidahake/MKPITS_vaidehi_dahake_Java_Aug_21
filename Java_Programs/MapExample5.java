//ex-5 Map Example: comparingByValue().
import java.util.*;
class MapExample5
{
public static void main(String args[])
{
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(107,"Rajat");
map.put(102,"Abhilasha");
map.put(101,"Darshan");
map.put(109,"Riya");
map.entrySet()
.stream()
.sorted(Map.Entry.comparingByValue())
.forEach(System.out::println);

}
}