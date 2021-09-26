//read only class with getter method.
class Bookss1
{
  private int id;
  private String title;
  private String author;

 
   public int getId()
      {
          return id;
      }
   
   public String getTitle()
    {
        return title;
    }
  
    public String getAuthor()
    {
          return author;
    }

}

class TestE2
{
public static void main(String args[])
{
   Books11 b1=new Books11();
   
   System.out.println("id of book is :"+b1.getId());
  
   System.out.println("title of book is :"+b1.getTitle());
  
   System.out.println("author of book is :"+b1.getAuthor());
   }
}

