//ex-3 HashSet
import java.util.*;
class HashSetExample3
{
public static void main(String args[])
{

      HashSet<String> set=new HashSet<String>();
      set.add("Ravi");
      set.add("Vijay");
      set.add("Raj");
      set.add("Ajay");
      System.out.println("An initial list of elements:"+set);
      set.remove("Ravi");
      System.out.println(" after invoking remove() method :"+set);
      HashSet<String> set1=new HashSet<String>();
	        set1.add("Raima");
	        set1.add("Guarav");
            set1.addAll(set1);
     System.out.println("updated list of elements:"+set1);
     set.removeAll(set1);
     System.out.println("after invoking removing all() method :"+set);
     set.removeIf(str->str.contains("Vijay"));
     System.out.println("after invoking removingif() method :"+set);
     set.clear();
     System.out.println("after invoking clear() method :"+set);



     }
    }
