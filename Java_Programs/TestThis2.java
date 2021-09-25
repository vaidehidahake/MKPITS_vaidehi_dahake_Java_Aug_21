//this keyword - refers to current instance variable.
class Book1
{
  int id;
  String title;
  int price;

  public Book1(int id,String title,int price)
  {
    this.id=id;
    this.title=title;
    this.price=price;
  }
   public void display()
   {
   System.out.println("id:"+id);
   System.out.println("title:"+title);
   System.out.println("price:"+price);
   }

}

class TestThis2
{
  public static void main(String args[])
  {
     Book1 b1=new Book1(1,"ashoka",120);
     b1.display();
     
   }
}

