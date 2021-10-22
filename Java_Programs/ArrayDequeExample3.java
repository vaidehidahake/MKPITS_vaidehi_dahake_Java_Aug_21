//ex-1 Java ArrayDeque- offerFirst() and pollLast().
import java.util.*;
class ArrayDequeExample3
{
  public static void main(String args[])
  {
    Deque<Integer> deque=new ArrayDeque<Integer>();
    deque.offer(11);
    deque.offer(20);
    deque.offer(50);
    deque.add(100);
    deque.offerFirst(111);
     System.out.println("after traversing through offerfirst");
    for(int i:deque)
    {
    System.out.println(i);
    }
    deque.pollLast();
    System.out.println("after traversing through polllast");
     for(int i:deque)
        {
        System.out.println(i);
    }
   }
 }