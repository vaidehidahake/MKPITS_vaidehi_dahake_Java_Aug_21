//calling constructor with one parameter  using this keyword.
//this() : to invoke current class constructor.
class Book6
{

  String title;
  int price;
  String company;

  Book6(String company)//constructor with one arguements.
  {
    this.company=company;

  }
  Book6(String title,int price,String company)
  {
    this(company);
    this.title=title;
    this.price=price;
   }

   void display()
   {

   System.out.println("title:"+title);
   System.out.println("price:"+price);
   System.out.println("company:"+company);
   }

}

class TestThis9
{
  public static void main(String args[])
  {
     Book6 b2=new Book6("amisha",300,"mkpits");
     b2.display();



   }
}

