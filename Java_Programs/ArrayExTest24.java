//ex-2 Copying a Java Array.
import java.util.*;
 class ArrayExTest24
{
  public static void main(String args[])
  {
	  char[] copyFrom={'a','d','e','e','g','f','i','j','g','l','m','n','o'};
	  char[] copyTo=new char[7];
	  System.arraycopy(copyFrom,3,copyTo,0,7);
	  System.out.println(String.valueOf(copyTo));
  }
}

