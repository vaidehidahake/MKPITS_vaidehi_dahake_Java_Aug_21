//Calling parameterized constructor from default constructor.

class Book7
{

  String title;
  int price;
  String company;

  Book7()
  {
    this("narnia",1000,"mkpits");

  }
  Book7(String title,int price,String company)
  {
    this.title=title;
    this.price=price;
    this.company=company;
   }

   void display()
   {

   System.out.println("title:"+title);
   System.out.println("price:"+price);
   System.out.println("company:"+company);
   }

}

class TestThis11
{
  public static void main(String args[])
  {
     Book7 b2=new Book7();
     b2.display();



   }
}

