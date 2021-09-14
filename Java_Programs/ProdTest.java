class Product
{
      int productId;
      String productName;
      float price;
}

class ProdTest
{
          public static void main(String[] args)
          {
             Product  p1=new Product();
             p1.productId=131;
             p1.productName="watch";
             p1.price=124.5f;
             System.out.println("productId="+p1.productId);
             System.out.println("productName="+p1.productName);
             System.out.println("price="+p1.price);
             Product p2=new Product();
	        p2.productId=132;
             p2.productName="table";
             p2.price=526.7f;
             System.out.println("productId="+p2.productId);
             System.out.println("productName="+p2.productName);
             System.out.println("price="+p2.price);
          }
}