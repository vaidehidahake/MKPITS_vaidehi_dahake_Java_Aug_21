//Write a program to print the area and perimeter(Perimeter = sum of the three sides) of a triangle having sides of 3, 4 and 5 units by
//creating a class named 'Triangle' without any parameter in its constructor.
class Triangle
{
   int length=3;
   int breadth=4;
   int height=5;
   float area;
   int perimeter;

  float CalArea()
  {
   return 0.5f*breadth*height;
  }
  int  CalPerimeter()
  {
   return length+breadth+height;
  }

}
class TestTriangle1
{
public static void main(String args[])
{
   Triangle t1=new Triangle();
   System.out.println("area of triangle is:"+t1.CalArea());
   System.out.println("perimeter of triangle is:"+t1.CalPerimeter());
}
}



