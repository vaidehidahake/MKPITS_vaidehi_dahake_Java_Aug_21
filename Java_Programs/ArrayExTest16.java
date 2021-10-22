//example.
import java.util.*;
 class ArrayExTest16
{
    public static void main(String args[])
    {
    int arr[]={50,60,70,80};
    for(int i=0;i<=arr.length;i++)
    {
    try
    {
      System.out.println(arr[i]);
    }
    catch(ArrayIndexOutOfBoundsException ee)
    {
    System.out.println(ee);
    }
    }
    System.out.println("bye");
    }
}

