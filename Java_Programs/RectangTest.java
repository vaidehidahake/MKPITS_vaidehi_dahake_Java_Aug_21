class Rectangles
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
 
 class RectangTest
 {
   public static void main(String[] args)
   {
      Rectangles r1=new Rectangles(),r2=new Rectangles();//creating multiple objects.
      
      r1.insertRecord(4,5);
      r2.insertRecord(11,5);
      r1.displayArea();
      r2.displayArea();
    }
    
 }   