//ex-2 an example to traverse the ArrayList elements through other ways.
import java.util.*;
class ArrayListExample14
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
   list.add("Mango");
   list.add("Orange");
   list.add("Banana");
   list.add("Grapes");
   System.out.println("Traversing list using listiterator");
   ListIterator<String>list1=list.listIterator(list.size());
   while(list1.hasPrevious())
   {
	   String str=list1.previous();
	   System.out.println(str);
   }
    System.out.println("Traversing list through for loop");
                   for(int i=0;i<list.size();i++)
	               {
	                System.out.println(list.get(i));
	               }


}

}