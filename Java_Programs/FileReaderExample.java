//FileReader
import java.io.FileReader;
public class FileReaderExample
{
 public static void main(String args[])throws Exception
 {
	 FileReader fr=new FileReader("G:\\text2.txt");
	 int i;
	 while((i=fr.read())!=-1)
	 {
		 System.out.println((char)i);
	 }
	 fr.close();
	 System.out.println("success");
  }
}

