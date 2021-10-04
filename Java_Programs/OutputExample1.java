import java.io.*;
 class OutputExample1
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream file = new FileOutputStream("f:\\testout.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.flush();
        data.close();
        System.out.println("Succcess...");
    }
}
