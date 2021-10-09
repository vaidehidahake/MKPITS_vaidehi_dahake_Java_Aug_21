import java.io.Serializable;
import java.io.*;
class Customers5 implements Serializable
{
   String name;
   String email;


 public Customers5(String name,String email)
 {
    this.name=name;
    this.email=email;
 }

 }

 public class Persist1S
 {
 public static void main(String args[])
 {
    try
    {
   Customers5 c1=new Customers5("raj","raj123@gmail.com");
    FileOutputStream fos=new FileOutputStream("G:\\Cus2.text");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
    oos.writeObject(c1);//Serialization.
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

       ObjectInputStream in=new ObjectInputStream(new FileInputStream("G:\\Cus2.text"));
      Customers5 c1=(Customers5)in.readObject();//deserialization.
       in.close();
       System.out.println("name of customer:"+c1.name);
       System.out.println("email of Customer:"+c1.email);
       }
       catch(Exception ee)
       {
        System.out.println(ee.toString());
       }




 }

 }



