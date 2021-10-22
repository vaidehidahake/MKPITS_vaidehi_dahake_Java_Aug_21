//ex-1 Java FileDescriptor.
import java.io.*;
class FileDescriptorExample
{
  public static void main(String[] args)
  {
     FileDescriptor fd = null;
     byte[] b = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65 };
     try
     {
      FileOutputStream fos = new FileOutputStream("Record.txt");
      FileInputStream fis = new FileInputStream("Record.txt");
      fd = fos.getFD();
      fos.write(b);
      fos.flush();
      fd.sync();
      int value = 0;
      while ((value = fis.read()) != -1)
      {
       char c = (char) value;
       System.out.print(c);
      }
      System.out.println("\nSync() successfully executed!!");
      }
      catch (Exception e)
      {
      e.printStackTrace();
      }
      }
    }


