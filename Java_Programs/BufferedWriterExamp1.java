import java.io.*;
class BufferedWriterExamp1
{
public static void main(String[] args) throws Exception
{
    FileWriter writer = new FileWriter("G:\\testout1.txt");
    BufferedWriter buffer = new BufferedWriter(writer);
    buffer.write("Welcome to mkpits");
    buffer.close();
    System.out.println("Success");
    }
}
