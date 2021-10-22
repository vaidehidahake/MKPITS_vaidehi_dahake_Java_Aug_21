//ex-1 LinkedList Example.
    import java.util.*;
    public class LinkedListExample1
    {
     public static void main(String args[])
     {

      LinkedList<String> list=new LinkedList<String>();
      list.add("Ram");
      list.add("Vijay");
      list.add("Ram");
      list.add("Ajay");

      Iterator<String> itr=list.iterator();
      while(itr.hasNext())
      {
       System.out.println(itr.next());
      }
     }
    }

