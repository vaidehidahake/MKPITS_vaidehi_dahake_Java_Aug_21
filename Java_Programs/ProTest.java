class Product
{
      int productid;
      String productname;
      float price;
}

class ProdTest
{
          public static void main(String[] args)
          {
             Product  p1=new Product();
             p1.productid=131;
             p1.productname="watch";
             p1.price=124.5f;
             System.out.println("productid="+p1.productid);
             System.out.println("productname="+p1.productname);
             System.out.println("price="+p1.price);
             Product p2=new Product();
	        p2.productid=132;
             p2.productname="table";
             p2.price=526.7f;
             System.out.println("productid="+p2.productid);
             System.out.println("productname="+p2.productname);
             System.out.println("price="+p2.price);
          }
}