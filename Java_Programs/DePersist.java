import java.io.*;

public class DePersist
{
public static void main(String args[])
{
   try
   {

   FileInputStream fos=new FileInputStream("F:\\stu1.text");
   ObjectInputStream oos=new ObjectInputStream(fos);
   Student4 s1=(Student4)oos.readObject();//deserialization.
   fos.close();
   System.out.println("id of student:"+s1.id);
   System.out.println("name of student:"+s1.name);
   }
   catch(Exception ee)
   {
    System.out.println(ee.toString());
   }
}

}




