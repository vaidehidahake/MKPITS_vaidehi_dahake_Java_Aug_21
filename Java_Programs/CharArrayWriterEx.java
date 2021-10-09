//Example of CharArrayWriter Class.
import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterEx
{
 public static void main(String args[])throws Exception
 {
   CharArrayWriter out=new CharArrayWriter();
   out.write("welcome to MKPITS");
   FileWriter f1=new FileWriter("G:\\a.txt");
   FileWriter f2=new FileWriter("G:\\b.txt");
   FileWriter f3=new FileWriter("G:\\c.txt");
   FileWriter f4=new FileWriter("G:\\d.txt");
   out.writeTo(f1);
   out.writeTo(f2);
   out.writeTo(f3);
   out.writeTo(f4);
   f1.close();
   f2.close();
   f3.close();
   f4.close();
   System.out.println("success");
   }
}
