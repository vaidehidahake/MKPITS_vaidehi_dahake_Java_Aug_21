//ex-2 awt list.
import java.awt.*;
public class AwtListExample2 
{
    AwtListExample2()
    {
      Frame f=new Frame();
      List l1=new List(6);
      l1.setBounds(100,100,80,80);
      l1.add("Iteam 1");
      l1.add("Iteam 2");
      l1.add("Iteam 3");
      l1.add("Iteam 4");
      l1.add("Iteam 5");
      l1.add("Iteam 6");
      f.add(l1);
      f.setLayout(null);
      f.setSize(400,400);
      f.setVisible(true);
    }
public static void main(String args[])
{
  AwtListExample2 a1=new AwtListExample2();
}
}

      
      
      
      