import java.io.*;
public class Persist
{
public static void main(String args[])
{
   try
   {
   Student4 s1=new Student4(11,"prajakta");
   FileOutputStream fos=new FileOutputStream("F:\\stu1.text");
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
}

}




