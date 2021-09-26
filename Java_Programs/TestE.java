//Encapsulation ex1.
//create a class Book having private fields title and author and methods(setter and getter methods) setTitle(),setAuthor and getTitle() and getAuthor().
class Books1
{
  private String title;
  private String author;

  public void setTitle(String title)
  {
      this.title=title;
  }
  public String getTitle()
    {
        return title;
  }
   public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getAuthor()
      {
          return author;
  }

}

class TestE
{
public static void main(String args[])
{
   Books1 b1=new Books1();
   b1.setTitle("Morgan");
   System.out.println("title of book is :"+b1.getTitle());
    b1.setAuthor("Michalclark");
   System.out.println("author of book is :"+b1.getAuthor());
   }
}

