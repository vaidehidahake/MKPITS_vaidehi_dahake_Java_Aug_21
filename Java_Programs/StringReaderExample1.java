//ex-1 string reader
import java.io.*;
public class StringReaderExample1
{
 public static void main(String args[])throws Exception
 {
  String srg="Hello Java!!\nWelcome to MKPITS";
  StringReader reader=new StringReader(srg);
  int k;
  while((k=reader.read())!=-1)
  {
    System.out.println((char)k);
  }

  }
}

