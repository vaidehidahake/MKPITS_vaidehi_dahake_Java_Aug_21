//ex-1 Copying a Java Array.
import java.util.*;
 class ArrayExTest23
{
  public static void main(String args[])
  {
	  char[] copyFrom={'a','d','e','f','g','h','i','j','k','l','m','n','o'};
	  char[] copyTo=new char[7];
	  System.arraycopy(copyFrom,2,copyTo,0,7);
	  System.out.println(String.valueOf(copyTo));
  }
}

