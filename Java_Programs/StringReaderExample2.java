//ex-2 string reader
import java.io.*;
public class StringReaderExample2
{
 public static void main(String args[])throws Exception
 {
  String srg="Hello Java World!!\nWelcome to MKPITS Institute";
  StringReader reader=new StringReader(srg);
  int m;
  while((m=reader.read())!=-1)
  {
    System.out.println((char)m);
  }

  }
}

