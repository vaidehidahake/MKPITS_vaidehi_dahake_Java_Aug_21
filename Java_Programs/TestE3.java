//write only class with setter method.

class Bookis1
{
  private int id;
  private String title;
  private String author;

  public void setId(int id)
   {
        if(id>100)
        {
        this.id=id;
        }
        else
        {
        System.out.println("id  should be greater than 100 ");
        }
  }



  public void setTitle(String title)
  {
      this.title=title;
  }

   public void setAuthor(String author)
    {
        this.author=author;
    }

    public void display()
    {
    System.out.println("id of book is:"+id);
    System.out.println("title of book is:"+title);
    System.out.println("author of book is:"+author);
    }


}

class TestE3
{
public static void main(String args[])
{
   Bookis1 b1=new Bookis1();
   b1.setId(111);

   b1.setTitle("Narnia");

    b1.setAuthor("Michalclark");
    b1.display();

   }
}

