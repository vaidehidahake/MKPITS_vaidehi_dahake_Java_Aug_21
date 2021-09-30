//wap to accept customername,productname,productprice and quantity then print customername,productname,productprice and quantity and totalamount.
import java.util.*;
class ProductAs
{
  public static void main(String args[])
  {
  String customername;
  String productname;
  int productprice;
  int quantity;
  int totalamount;

  Scanner s=new Scanner(System.in);
  System.out.println("enter customer name:");
  customername=s.next();
  System.out.println("enter product name:");
  productname=s.next();
  System.out.println("enter product price:");
   productprice=s.nextInt();
    System.out.println("enter quantity:");
    quantity=s.nextInt();
    totalamount=productprice*quantity;
    System.out.println("totalamount:"+totalamount);

   }
}



