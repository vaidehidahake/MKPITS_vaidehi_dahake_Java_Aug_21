import mkpits2.Order;
import java.util.*;
public class TestOrder
{
  public static void main(String args[])
{
  Order o1=new Order();

  Scanner scan=new Scanner(System.in);

  System.out.println("enter orderno:");
  int i=scan.nextInt();
  System.out.println("enter orderdate:");
  int d=scan.nextInt();
  System.out.println("enter custname:");
  String n=scan.next();
  System.out.println("enter productname:");
  String pn=scan.next();
  System.out.println("enter price:");
  int p=scan.nextInt();
  System.out.println("enter quantity:");
  int q=scan.nextInt();
  o1.insert(i,d,n,pn,p,q);
  o1.CalculateTotalBill();
  o1.display();
}
  
} 
 