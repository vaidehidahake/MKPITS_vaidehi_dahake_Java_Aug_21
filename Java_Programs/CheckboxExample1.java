//ex1-Checkbox Example.
import java.awt.*;
public class CheckboxExample1
{
   CheckboxExample1()
   {
      Frame f= new Frame("CheckboxExample");
      Checkbox Checkbox1=new Checkbox("c++");
      Checkbox1.setBounds(100,100,50,50);
      Checkbox Checkbox2=new Checkbox("Java",true);
      Checkbox2.setBounds(100,150,50,50);
      f.add(Checkbox1);
      f.add(Checkbox2);
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
    }

   public static void main(String args[])
   {

    CheckboxExample1 c1=new CheckboxExample1();
   }
}