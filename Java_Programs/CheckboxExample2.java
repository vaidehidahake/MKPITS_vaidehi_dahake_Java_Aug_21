//ex2-Checkbox Example.
import java.awt.*;
public class CheckboxExample2
{
      CheckboxExample2()
      {
         Frame f=new Frame("Checkbox Example");
         Checkbox Checkbox1=new Checkbox("c");
         Checkbox1.setBounds(100,100,50,50);
         Checkbox Checkbox2=new Checkbox("c++",true);
         Checkbox2.setBounds(100,100,50,50);
         Checkbox Checkbox3=new Checkbox("Java",true);
         Checkbox3.setBounds(100,130,50,50);
         Checkbox Checkbox4=new Checkbox("Python",true);
         Checkbox4.setBounds(100,160,50,50);
         f.add(Checkbox1);
         f.add(Checkbox2);
         f.add(Checkbox3);
         f.add(Checkbox4);
         f.setSize(400,400);
         f.setLayout(null);
         f.setVisible(true);
       }
       
       public static void main(String args[])
       {
          CheckboxExample2 c1=new CheckboxExample2();
       }
   }    
          
         