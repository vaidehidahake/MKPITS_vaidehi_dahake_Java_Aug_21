//ex-1 Get and Set ArrayList.
import java.util.*;
class ArrayListExample7
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
   list.add("Ramesh");
   list.add("Esha");
   list.add("John");
   list.add("Jonita");
   System.out.println("returning element: "+list.get(1));
   list.set(1,"Disha");
  for(String name:list)
  {
  System.out.println(name);
  }
 }
}