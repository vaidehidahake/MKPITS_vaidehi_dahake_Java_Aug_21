//ex-6 Map Example: comparingByValue() in Descending Order..
import java.util.*;
class MapExample6
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
.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
.forEach(System.out::println);

}
}