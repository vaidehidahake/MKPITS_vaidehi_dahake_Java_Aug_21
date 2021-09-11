import java.util.*;
class Assignm
{
  public static void main(String args[])
  {
     int length;
     int breadth;
     Scanner s=new Scanner(System.in);
     System.out.println("enter length :");
     length=s.nextInt();
     System.out.println("enter breadth:");
     breadth=s.nextInt();
     int area=length*breadth;
     System.out.println("area ="+area);
  }
}