//this keyword - refers to current instance variable.
class Book2
{
  int id;
  String title;
  int price;

  void insert(int id,String title,int price)
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

class TestThis3
{
  public static void main(String args[])
  {
     Book2 b1=new Book2();
     b1.insert(121,"oracle",500);
     b1.display();
     
   }
}

