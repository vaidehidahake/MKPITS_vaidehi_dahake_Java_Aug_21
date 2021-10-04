//wap to accept your name and write this name in a file .
import java.io.*;
import java.util.*;

class FileAS1
{
   public static void main(String args[])
   {
     try
     {
        FileOutputStream fs=new FileOutputStream("G:\\file1.txt");
        Scanner s=new Scanner(System.in);
        System.out.println("enter name =");
        String str="name";
        str +=s.nextLine();
        byte[] arr=str.getBytes();
        fs.write(arr);
        fs.close();
        System.out.println("data written into file");
       }
       catch(Exception ee)
       {
         System.out.println(ee.toString());
       }
     }
   }