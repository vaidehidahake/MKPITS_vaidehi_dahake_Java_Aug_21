package mkpits2;
public class Order
{
    int orderno;
    int orderdate;
    String custname;
    String productname;
    int price;
    int quantity;
    float total;
public void insert(int i,int d,String n,String pn,int p,int q)
   {
      orderno=i;
      orderdate=d;
      custname=n;
      productname=pn;
      price=p;
      quantity=q;
    }
public void CalculateTotalBill()
   {
       total= price * quantity;
   }
public void display()
{
    System.out.println("orderno="+orderno);
    System.out.println("orderdate="+orderdate);
    System.out.println("custname="+custname);
    System.out.println("productname="+productname);
    System.out.println(" price = " +price);
    System.out.println("quantity = "+quantity);
    System.out.println("total = "+total);
}
}
    
          