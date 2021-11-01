//ex-7  wap to accept a num and print the table of that number.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class EventExample7 extends Frame implements ActionListener
{
   Label l1;
   TextArea l2;
   Button b1;
   TextField t1;
   EventExample7()
   {
      l1=new Label("number");
      l1.setBounds(20,50,100,30);
      add(l1);
      t1=new TextField();
      t1.setBounds(130,50,100,30);
      add(t1);
      b1=new Button("result");
      b1.setBounds(20,100,100,30);
      b1.addActionListener(this);
      add(b1);
      l2=new TextArea(30,30);
      l2.setBounds(20,200,200,100);
      add(l2);
      setLayout(null);
      setSize(400,400);
      setVisible(true);
   }
   public void actionPerformed(ActionEvent ae)
   {
      int num=Integer.parseInt(t1.getText());
      StringBuilder sb=new StringBuilder();
      int res=0;
      if(ae.getSource()==b1)
      {
         for(int i=1;i<=10;i++)
         {
           res=num*i;
           sb.append(num+"*"+i+"="+res+"\n");
         }
         l2.setText(sb.toString());
       }
    }
    public static void main(String args[])
    {
       EventExample7 f1=new EventExample7();
    }

}

