//Java Serialization with Inheritance (IS-A Relationship).
import java.io.Serializable;
import java.io.*;
class Person implements Serializable
{
   int id;
   String name;
   public Person(int id,String name)
   {
     this.id=id;
     this.name=name;
   }
}

class Student extends Person
{
   int fee;
   String course;
   public Student(int id,String name,int fee,String course)
      {
        super(id,name);
        this.fee=fee;
        this.course=course;
      }
 }

     public class SerializeISA
     {
      public static void main(String args[])
      {
         try
         {
       //Creating the object
       Student s1 =new Student(234,"arya",55000,"Engineering");
       //Creating stream and writing the object
       FileOutputStream fout=new FileOutputStream("F:\\f8.txt");
       ObjectOutputStream out=new ObjectOutputStream(fout);
       out.writeObject(s1);
       out.flush();
       //closing the stream
       out.close();
       System.out.println("success");
       }
       catch(Exception e)
       {
       System.out.println(e);
       }
       try
       {
       //Creating stream to read the object
       ObjectInputStream in=new ObjectInputStream(new FileInputStream("F:\\f8.txt"));
       Student s=(Student)in.readObject();
       //printing the data of the serialized object
       System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
       //closing the stream
       in.close();
       }catch(Exception e){System.out.println(e);}
      }
     }

