//ex-1 example of StringTokenizer class.
import java.util.StringTokenizer;
class StringTokenizerEx1
{
public static void main(String args[])
{
   StringTokenizer st=new StringTokenizer("my name is khan","");
   while(st.hasMoreTokens())
   {
     System.out.println(st.nextToken());
   }
 }
 }