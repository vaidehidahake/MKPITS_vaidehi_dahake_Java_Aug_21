//ByteArrayInputStream Ex1
import java.io.*;
public class ReadExample
{
  public static void main(String args[])throws IOException
  {
     byte[] buf = { 35, 36, 37, 38 };
     ByteArrayInputStream byt = new ByteArrayInputStream(buf);
     int k=0;
     while ((k = byt.read()) != -1)
     {
        char ch=(char)k;
        System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
      }

   }

}
