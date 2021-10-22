//ex-1 awt EventExample
import java.awt.*;
import java.awt.event.*;
class EventExample1 extends Frame implements ActionListener
{
EventExample1()
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
   System.out.println("hello from button");
 }

 public static void main(String args[])
 {
    EventExample1 e1=new EventExample1();
 }

 }

