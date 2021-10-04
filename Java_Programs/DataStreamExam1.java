import java.io.*;
class DataStreamExam1
{
  public static void main(String[] args) throws IOException
  {
    InputStream input = new FileInputStream("f:\\myfile1.txt");
    DataInputStream inst = new DataInputStream(input);
    int count = input.available();
    byte[] ary = new byte[count];
    inst.read(ary);
    for (byte bt : ary)
    {
      char k = (char) bt;
      System.out.print(k+"-");
    }
  }
}

