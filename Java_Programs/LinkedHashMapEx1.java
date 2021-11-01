//ex-1 linkedhasmap.
    import java.util.*;  
    class LinkedHashMapEx1
    {  
     public static void main(String args[])
     {  
       
      LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
      
      hm.put(100,"Amit");  
      hm.put(101,"Vijay");  
      hm.put(102,"Rahul");  
      
    for(Map.Entry m:hm.entrySet())
    {  
      System.out.println("Key is:"+m.getKey());
      System.out.println("value is:"+m.getValue());
      }  
     }  
    }  
