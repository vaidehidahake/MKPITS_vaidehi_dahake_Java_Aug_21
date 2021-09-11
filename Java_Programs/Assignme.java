import java.util.*;
class Assignme
{
  public static void main(String args[])
  {
     int length;
     int breadth;
     int height;
     Scanner s=new Scanner(System.in);
     System.out.println("enter length :");
     length=s.nextInt();
     System.out.println("enter breadth:");
     breadth=s.nextInt();
     System.out.println("enter height:");
     height=s.nextInt();
     int volume=length*breadth*height;
     System.out.println("volume ="+volume);
  }
}