//ex-2 awt EventExample
import java.awt.*;
import java.awt.event.*;
class EventExample2 extends Frame implements ActionListener
{
EventExample2()
{
   Button b1=new Button("ok");
   b1.setBounds(100,50,100,25);
   b1.addActionListener(this);
   add(b1);
   setLayout(null);
   setSize(300,300);
   setVisible(true);
 }
 public void actionPerformed(ActionEvent ae)
 {
   System.out.println("hello from MKPITS");
 }

 public static void main(String args[])
 {
    EventExample2 e1=new EventExample2();
 }

 }

