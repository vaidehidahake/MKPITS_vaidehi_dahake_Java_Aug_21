//ex-4 LinkedHashSet.
import java.util.*;
class LinkedHashSetExample4
{
	public static void main(String args[])
	{
		LinkedHashSet<String>set=new LinkedHashSet();
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("one");
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
	    }

     }

}