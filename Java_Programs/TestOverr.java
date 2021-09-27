//method overriding.
class Figure
{
   void draw()
   {
     System.out.println("draw method of figure class");
   }
}
class Triangle extends Figure
{
   void draw()
   {
     System.out.println("draw method of triangle class");
   }
}
 class TestOverr
 {
 public static void main(String args[])
 {

   Figure f=new Figure();
   f.draw();
   Triangle t=new Triangle();
   t.draw();
  }
}