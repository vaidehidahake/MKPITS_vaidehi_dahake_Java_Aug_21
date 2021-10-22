//ex-2 string writer
import java.io.*;
public class StringWriterExample2
{
  public static void main(String args[])throws IOException
  {
    char[] ary=new char[612];
    StringWriter writer=new StringWriter();
    FileInputStream input=null;
    BufferedReader buffer=null;
    input=new FileInputStream("G://testout3.txt");
    buffer=new BufferedReader(new InputStreamReader(input,"UTF-8"));
    int y;
    while((y=buffer.read(ary))!=-1)
    {
      writer.write(ary,0,y);
    }
    System.out.println(writer.toString());
    writer.close();
    buffer.close();
  }
}  
  
  
  