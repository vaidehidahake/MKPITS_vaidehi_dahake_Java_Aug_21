//FilterOutputStream Ex1
import java.io.*;
public class FilterExample
{
   public static void main(String args[])throws IOException
   {
       File data=new File("e:\\files2.txt");
       FileOutputStream file=new  FileOutputStream(data);
       FilterOutputStream filter=new FilterOutputStream(file);
       String s="welcome to new world";
       byte b[]=s.getBytes();
       filter.write(b);
       filter.flush();
       filter.close();
       file.close();
       System.out.println("success");
    }
 }    
       
       