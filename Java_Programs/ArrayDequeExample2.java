//ex-2 ArrayDeque.
import java.util.*;
class ArrayDequeExample2
{
  public static void main(String args[])
  {
    Deque<Integer> deque=new ArrayDeque<Integer>();
    deque.add(11);
    deque.add(20);
    deque.add(50);
    deque.add(100);
    for(int i:deque)
    {
    System.out.println(i);
    }
   }
 }

