class Rectangle
{
  int length;
  int breadth;
  
  void insertRecord(int l, int b)
  {
   length=l;
   breadth=b;
  }
   
   void displayArea()
   {
   System.out.println(length*breadth);
   
   }
 }
 
 class RectangleTest
 {
   public static void main(String[] args)
   {
      Rectangle r1=new Rectangle();
       Rectangle r2=new Rectangle();
      r1.insertRecord(4,5);
      r2.insertRecord(11,5);
      r1.displayArea();
      r2.displayArea();
    }
    
 }   