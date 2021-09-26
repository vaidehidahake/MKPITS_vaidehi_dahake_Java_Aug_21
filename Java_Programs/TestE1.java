//Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method.
class Books11
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
   public int getId()
      {
          return id;
  }



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

class TestE1
{
public static void main(String args[])
{
   Books11 b1=new Books11();
   b1.setId(111);
   System.out.println("id of book is :"+b1.getId());
   b1.setTitle("Morgan");
   System.out.println("title of book is :"+b1.getTitle());
    b1.setAuthor("Michalclark");
   System.out.println("author of book is :"+b1.getAuthor());
   }
}

