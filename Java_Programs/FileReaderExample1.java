//FileReader
import java.io.FileReader;
public class FileReaderExample1
{
 public static void main(String args[])throws Exception
 {
	 FileReader fr=new FileReader("F:\\myfile1.txt");
	 int i;
	 while((i=fr.read())!=-1)
	 {
		 System.out.println((char)i);
	 }
	 fr.close();
	 System.out.println("success");
  }
}

