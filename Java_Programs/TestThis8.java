//this() : to invoke current class constructor.
class Book5
{

  String title;
  int price;

  Book5()//constructor with no arguements.+
  {
    title="oracle";
    price=500;
    this.display();
  }
  Book5(String title,int price)
  {
    this();
    this.title=title;
    this.price=price;
   }

   void display()
   {

   System.out.println("title:"+title);
   System.out.println("price:"+price);
   }

}

class TestThis8
{
  public static void main(String args[])
  {
     Book5 b2=new Book5("amisha",300);
     b2.display();



   }
}

