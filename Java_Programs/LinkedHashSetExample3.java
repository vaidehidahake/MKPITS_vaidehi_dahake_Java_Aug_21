//ex-3 LinkedHashSet.
import java.util.*;
class LinkedHashSetExample3
{
	public static void main(String args[])
	{
		LinkedHashSet<String> set=new LinkedHashSet();
		set.add("Riya");
		set.add("Yash");
		set.add("Riya");
		set.add("Karan");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
	    }

     }

}