//when no need of this keyword.
//this keyword - refers to current instance variable.
class Book3
{
  int id;
  String title;
  int price;

  Book3(int i,String t,int p)
  {
    id=i;
    title=t;
    price=p;
  }
   public void display()
   {
   System.out.println("id:"+id);
   System.out.println("title:"+title);
   System.out.println("price:"+price);
   }

}

class TestThis4
{
  public static void main(String args[])
  {
    Book3 b1=new Book3(101,"Tiger",700);
    Book3 b2=new Book3(233,"Mermaid",1000);
     
     b1.display();
     b2.display();
     
   }
}

