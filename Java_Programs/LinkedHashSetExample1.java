//ex-1 LinkedHashSet.
import java.util.*;
class LinkedHashSetExample1
{
	public static void main(String args[])
	{
		LinkedHashSet<String>set=new LinkedHashSet();
		set.add("Riya");
		set.add("Yash");
		set.add("Kajol");
		set.add("Karan");
		Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
	    }

     }

}