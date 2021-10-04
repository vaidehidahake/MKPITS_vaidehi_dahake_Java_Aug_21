//Java BufferedReader Class.
    import java.io.*;
    class BufferedReaderExam2
    {
        public static void main(String args[])throws Exception
        {
              FileReader fr=new FileReader("G:\\testout1.txt");
              BufferedReader br=new BufferedReader(fr);

              int i;
              while((i=br.read())!=-1)
              {
              System.out.print((char)i);
              }
              br.close();
              fr.close();
        }
    }
