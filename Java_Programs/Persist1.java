import java.io.Serializable;
import java.io.*;
class Student5 implements Serializable
{
   int id;
   String name;


 public Student5(int id,String name)
 {
    this.id=id;
    this.name=name;
 }

 }

 public class Persist1
 {
 public static void main(String args[])
 {
    try
    {
    Student5 s1=new Student5(12,"pratik");
    FileOutputStream fos=new FileOutputStream("F:\\stu2.text");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(s1);//Serialization.
    oos.flush();
    fos.close();
    System.out.println("Success");
    }
    catch(Exception ee)
    {
     System.out.println(ee.toString());
    }
    try
       {

       ObjectInputStream in=new ObjectInputStream(new FileInputStream("F:\\stu2.text"));
       Student5 s1=(Student5)in.readObject();//deserialization.
       in.close();
       System.out.println("id of student:"+s1.id);
       System.out.println("name of student:"+s1.name);
       }
       catch(Exception ee)
       {
        System.out.println(ee.toString());
       }




 }

 }



