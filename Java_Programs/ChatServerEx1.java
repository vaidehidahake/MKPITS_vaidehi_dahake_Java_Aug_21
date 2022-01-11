import java.io.*;
import java.net.*;
public class ChatServerEx1 {
public static void main(String[] args) throws Exception{

ServerSocket ss=new ServerSocket(2000);
System.out.println("Server is ready at posrt no. 2000....");

Socket s=ss.accept();//establishes connection
System.out.println("Client Connected.");

for(;;)
{
DataInputStream dis=new DataInputStream(s.getInputStream());
String  str=dis.readLine();
System.out.println("Client >"+str);

PrintStream ps=new PrintStream(s.getOutputStream());
DataInputStream dis1=new DataInputStream(System.in);
String str1=dis1.readLine();
ps.println(str1);
if(str1.equals("bye"));
{
	System.exit(0);
	//dis.close();
	//dis1.close();
	//ps.close();
	//s.close();
	//ss.close();
}


}
}
}