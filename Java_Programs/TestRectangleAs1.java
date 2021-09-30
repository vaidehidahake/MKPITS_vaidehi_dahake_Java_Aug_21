//Write a program to print the area of a rectangle by creating a class named 'Area'
//taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea'
//which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
import java.util.*;

class Area
{
	int length;
	int breadth;
  Area(int length,int breadth)
  {
     this.length=length;
     this.breadth=breadth;
  }

  int returnArea()
  {
    return length*breadth;
  }
}

class TestRectangleAs1
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter length:");
	int length=s.nextInt();
	System.out.println("enter breadth:");
	int breadth=s.nextInt();

   Area a1=new Area(length,breadth);

  System.out.println("area of rectangle is:"+ a1.returnArea());
 }
}
