class Student
{
  
  void getdata(String name)
  {
      System.out.println("name="+name);
      
   }   
   
    void getdata(String name,String address)
     {
         getdata("raj");
         System.out.println("address="+address);
         
   } 
}
class TestOver6
{
  public static void main(String args[])
  {
  Student s=new Student();
  s.getdata("raj","nagpur");
  }
}  