//Print the average of three numbers entered by user by creating a class named 'Average'
//having a method to calculate and print the average.
import java.util.*;
class Average
{
  int n1,n2,n3;

  int CalculateAverage(int n1,int n2,int n3)
  {
    return n1+n2+n3;
  }

}

class TestAverageAs
{
public static void main(String args[])
{
 Scanner scan=new Scanner(System.in);
 System.out.println("enter number one:");
 int n1=scan.nextInt();
 System.out.println("enter number two:");
 int n2=scan.nextInt();
 System.out.println("enter number three:");
 int n3=scan.nextInt();
 Average a1=new Average();
 a1.CalculateAverage(n1,n2,n3);
 System.out.println("average of three numbers is :"+a1.CalculateAverage(n1,n2,n3));
 }
 }



