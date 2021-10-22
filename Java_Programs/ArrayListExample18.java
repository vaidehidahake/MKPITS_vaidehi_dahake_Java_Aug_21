//ex-1 example to add elements.
    import java.util.*;
     class ArrayListExample18
     {
     public static void main(String args[])
     {
      ArrayList<String> list=new ArrayList<String>();
               System.out.println("Initial list of elements: "+list);
               //Adding elements to the end of the list
               list.add("Ravi");
               list.add("Vijay");
               list.add("Ajay");
               System.out.println("After invoking add(E e) method: "+list);
               //Adding an element at the specific position
               list.add(1, "Gauri");
               System.out.println("After invoking add(int index, E element) method: "+list);
               ArrayList<String> list2=new ArrayList<String>();
               list2.add("Santanu");
               list2.add("Hanumant");
               //Adding second list elements to the first list
               list.addAll(list2);
               System.out.println("After invoking addAll(Collection<? extends E> c) method: "+list);
               ArrayList<String> list3=new ArrayList<String>();
               list3.add("John");
               list3.add("Rahul");
               //Adding second list elements to the first list at specific position
               list.addAll(1, list3);
               System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+list);

     }
    }
