//BufferedOutputStream Example
import java.io.*;
import java.util.*;
public class BufferedOutputStreamExample1
{
  public static void main(String args[])throws Exception
  {
    FileOutputStream fout=new FileOutputStream("G:\\text2.txt");
    BufferedOutputStream bout=new BufferedOutputStream(fout);
    Scanner scan=new Scanner(System.in);
    System.out.println("enter name :");
    String str="name";
    str +=scan.nextLine();
    byte[] arr=str.getBytes();
    bout.write(arr);
    bout.flush();
    bout.close();
    fout.close();
    System.out.println("success");
   }
 }

