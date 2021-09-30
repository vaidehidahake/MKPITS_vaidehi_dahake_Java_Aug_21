//Write a program to print the area of two rectangles having sides (4,5) and (5,8)
//respectively by creating a class named 'Rectangle' with a method named 'Area'
//which returns the area and length and breadth passed as parameters to its constructor.
class Rectangle
{
int length;
int breadth;

int Area(int length,int breadth)
{
   return length*breadth;
}


}

class TestRectangleAs
{
public static void main(String args[])
{
  Rectangle r1=new Rectangle();
  int res=r1.Area(4,5);
  System.out.println("area of rectangle is:"+res);
  Rectangle r2=new Rectangle();
  res=r2.Area(5,8);
  System.out.println("area of rectangle is:"+res);
  }
}

