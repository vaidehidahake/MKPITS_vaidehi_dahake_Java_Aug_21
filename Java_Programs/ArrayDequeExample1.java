//ex-1 ArrayDeque.
import java.util.*;
class ArrayDequeExample1
{
  public static void main(String args[])
  {
    Deque<String> deque=new ArrayDeque<String>();
    deque.add("Ajay");
    deque.add("Ramesh");
    deque.add("Kajol");
    deque.add("Anita");
    for(String str:deque)
    {
    System.out.println(str);
    }
   }
 }  
    
    