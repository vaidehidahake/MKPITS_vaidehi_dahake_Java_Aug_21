    import java.io.FileOutputStream;
    import java.io.PrintStream;
    public class PrintStreamTest
    {
     public static void main(String args[])throws Exception
     {
       FileOutputStream fout=new FileOutputStream("F:\\testout1.txt");
       PrintStream pout=new PrintStream(fout);
       pout.println(2016);
       pout.println("Hello Java");
       pout.println("Welcome to Java");
       pout.close();
       fout.close();
      System.out.println("Success?");
     }
    }

