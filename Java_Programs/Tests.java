    class Products
    {
     //defining fields
     int productId;//field or data member or instance variable
     String productName;
     double productPrice;
     //creating method to insert product
     public void insertProduct(int pid,String pn,double pr)
     {
		productId=pid;
		      productName=pn;
		      productPrice=pr;
	 }

	  public void displayProduct()
	      {
	 		System.out.println("product id = " +productId);
					      System.out.println("product name = " + productName);
					      System.out.println("product price = " + productPrice);

	 }

    }

    class Tests
    {
		public static void main(String args[])
		{
		      //Creating an object or instance
		      Products p1=new Products();//creating an object of Product
		      p1.insertProduct(11,"monitor",15000);
		      p1.displayProduct();


     }
 }
