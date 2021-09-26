//you can't change the value of the college data member.
class Mag
{
  private int id;
  private String college="kdk";
  public void setId(int id)
  {
     this.id=id;
  }
  public int getId()
    {
       return id;
  }   
  
  public String getCollege()
  {
     return college;
   
  }  
}
class TestMag
{
    public static void main(String args[])
    {
    Mag m=new Mag();
    m.setId(121);
    System.out.println(m.getId());
    System.out.println(m.getCollege());
    }
}    
    