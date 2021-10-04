//Java FileOutputStream example 2: write string and converting it into byte.
import java.io.FileOutputStream;

public class FileOutputStreamExample1
{
public static void main(String args[])
{
  try
  {
  FileOutputStream fout=new FileOutputStream("F:\\myfile1.txt");
  String s="welcome to java";
  byte b[]=s.getBytes();//converting string into bytes.
  fout.write(b);
  fout.close();
  System.out.println("success...");
  }
 catch(Exception e)
 {
  System.out.println(e);
 }
}
}
