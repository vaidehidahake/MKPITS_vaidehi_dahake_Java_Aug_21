//ex-5 example of StringTokenizer class.
import java.util.StringTokenizer;
class StringTokenizerEx5
{
public static void main(String args[])
{
	String str="Welome.to.MKPITS";
	String arr[]=new String[4];
	StringTokenizer st=new StringTokenizer(str,".");
	int i=0;
	   while(st.hasMoreTokens())
	   {
	     arr[i]=st.nextToken();
	     i=i+1;
       }
       for(i=0;i<4;i++)
       {
		   System.out.println(arr[i]);
	   }
   }
}