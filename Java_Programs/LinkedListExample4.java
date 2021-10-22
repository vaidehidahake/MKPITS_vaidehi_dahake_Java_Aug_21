//LinkedList Example to reverse a list of elements.
    import java.util.*;
    public class LinkedListExample4
    {
     public static void main(String args[])
     {

      LinkedList<String> list=new LinkedList<String>();
               list.add("Gopal");
               list.add("Vijay");
               list.add("Abhay");
               //Traversing the list of elements in reverse order
               Iterator i=list.descendingIterator();
               while(i.hasNext())
               {
                   System.out.println(i.next());
               }

     }
    }
