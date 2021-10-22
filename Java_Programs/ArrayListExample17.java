//ex-1 an example to serialize an ArrayList object and then deserialize it.
import java.io.*;
import java.util.*;
class ArrayListExample17
{
public static void main(String args[])
{
  ArrayList<String>list=new ArrayList<String>();
   list.add("Ramesh");
   list.add("Esha");
   list.add("John");
   list.add("Jonita");
        try
            {
             //Serialization
             FileOutputStream fos=new FileOutputStream("file");
             ObjectOutputStream oos=new ObjectOutputStream(fos);
             oos.writeObject(list);
             fos.close();
             oos.close();
             //Deserialization
             FileInputStream fis=new FileInputStream("file");
             ObjectInputStream ois=new ObjectInputStream(fis);
             ArrayList list1=(ArrayList)ois.readObject();
             System.out.println(list1);
             }
             catch(Exception e)
             {
              System.out.println(e);
              }

}

}
