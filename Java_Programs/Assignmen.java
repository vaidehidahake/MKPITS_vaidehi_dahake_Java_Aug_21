import java.util.*;
class Assignmen
{
  public static void main(String args[])
  {
     int sub1;
     int sub2;
     int sub3;
     Scanner s=new Scanner(System.in);
     System.out.println("enter sub1 marks :");
     sub1=s.nextInt();
     System.out.println("enter sub2 marks :");
     sub2=s.nextInt();
     System.out.println("enter sub3 marks :");
     sub3=s.nextInt();
     int totalmarks=sub1+sub2+sub3;
     System.out.println("totalmarks ="+totalmarks);
  }
}