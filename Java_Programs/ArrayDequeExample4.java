//ex-2 Java ArrayDeque- offerFirst() and pollLast().
import java.util.*;
class ArrayDequeExample4
{
  public static void main(String args[])
  {
    Deque<String> deque=new ArrayDeque<String>();
    deque.offer("Ajay");
    deque.offer("Ramesh");
    deque.add("Kajol");
    deque.offer("Anita");
    deque.offerFirst("Raj");
     System.out.println("after traversing through offerfirst");
    for(String str:deque)
    {
    System.out.println(str);
    }
    deque.pollLast();
    System.out.println("after traversing through polllast");
     for(String str:deque)
        {
        System.out.println(str);
    }
   }
 }