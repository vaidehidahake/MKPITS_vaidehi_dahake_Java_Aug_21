//FileInputStream Example
import java.io.FileInputStream;
public class FileInputStreamExample
{
 public static void main(String args[])
 {
    try
   {
    FileInputStream fin=new FileInputStream("F:\\myfile.txt");
    int i=fin.read();
    System.out.println((char)i);
    fin.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
  }
}