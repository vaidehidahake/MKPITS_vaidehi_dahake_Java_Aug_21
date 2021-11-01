//ex-8 event handling within class.
import java.awt.*;
import java.awt.event.*;
class EventExample8 extends Frame implements ActionListener
{
   TextField t1;
   EventExample8()
   {

      t1=new TextField();
      t1.setBounds(20,50,100,30);
      add(t1);
      Button b1=new Button("OK");
      b1.setBounds(20,100,100,30);
      b1.addActionListener(this);
      add(b1);

      setLayout(null);
      setSize(400,400);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent ae)
   {
      t1.setText("Welcome");
    }
    public static void main(String args[])
    {
       EventExample8 f1=new EventExample8();
    }

}

