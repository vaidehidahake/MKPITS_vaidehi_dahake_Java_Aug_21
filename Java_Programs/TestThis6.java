// this: to invoke current class method.
class Book4
{
  int id;
  String title;
  int price;

 void insert(int id,String title,int price)
  {
    this.id=id;
    this.title=title;
    this.price=price;
    this.display();
  }
 void display()
   {
   System.out.println("id:"+id);
   System.out.println("title:"+title);
   System.out.println("price:"+price);
   }

}

class TestThis6
{
  public static void main(String args[])
  {
    Book4 b1=new Book4();
   b1.insert(11,"amit",230);
     
     
     
   }
}

