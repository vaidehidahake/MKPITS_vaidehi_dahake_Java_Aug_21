//FilterInputStream Ex1
import java.io.*;
public class FilterExample1
{
   public static void main(String args[])throws IOException
   {
       File data=new File("e:\\files2.txt");
     FileInputStream file=new   FileInputStream(data);
       FilterInputStream filter=new BufferedInputStream(file);
       int k=0;
       while((k=filter.read())!=-1)
       {
         System.out.println((char)k);
       }

       filter.close();
       file.close();
       System.out.println("success");
    }
 }

